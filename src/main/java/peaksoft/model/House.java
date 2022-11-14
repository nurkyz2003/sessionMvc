package peaksoft.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.model.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "house_seq")
    @SequenceGenerator(name = "house_seq",
            sequenceName = "house_seq",
            allocationSize = 1)
    private Long id;

    private String name;

    private String image;

    private int price;

    private String description;

    private String address;

    private int person;

    @OneToMany (cascade = CascadeType.ALL,mappedBy = "house")

    private List<Comment> comments;

    public void addComment (Comment comment){
        if (comments == null){
            comments= new ArrayList<>();
        }
        comments.add(comment);
    }

}
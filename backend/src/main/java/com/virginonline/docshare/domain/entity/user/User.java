package com.virginonline.docshare.domain.entity.user;

import com.virginonline.docshare.domain.entity.comment.Comment;
import com.virginonline.docshare.domain.entity.document.Document;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "username")
  private String username;

  @Column(name = "name")
  private String name;

  @Column(name = "password")
  private String password;
  @Column(name = "avatar")
  private String avatar;
  @ManyToMany
  @JoinTable(name = "user_authorities", joinColumns = @JoinColumn(name = "id_user"),
      inverseJoinColumns = @JoinColumn(name = "id_authorities"))
  private Set<Authority> authorities;


  @OneToMany(mappedBy = "author")
  private Set<Comment> comments = new LinkedHashSet<>();

  @ManyToMany
  @JoinTable(name = "user_documents",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "document_id"))
  private Set<Document> documents = new LinkedHashSet<>();


}

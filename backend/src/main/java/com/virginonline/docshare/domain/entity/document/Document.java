package com.virginonline.docshare.domain.entity.document;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
@Getter
@Setter
@Entity
@Table(name = "documents")
public class Document {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;


  @Column(name = "url", length = Integer.MAX_VALUE)
  private String url;

  @Column(name = "properties")
  @JdbcTypeCode(SqlTypes.JSON)
  private DocumentProperties properties;

  @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
  private String name;

}

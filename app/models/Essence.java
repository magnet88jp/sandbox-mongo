package models;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Indexed;
import org.apache.commons.codec.digest.DigestUtils;

@Entity
public class Essence extends Model {

  @Indexed
  public String sha;
  public String content;

  public Essence(String content) {
    this.content = content;
    this.sha = DigestUtils.shaHex(content);
  } 
}
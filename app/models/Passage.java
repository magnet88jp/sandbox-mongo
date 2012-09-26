package models;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Indexes;
import com.google.code.morphia.annotations.Index;
import org.apache.commons.codec.digest.DigestUtils;

@Entity
@Indexes({
  @Index("target, perspective, compo")
})
//@Indexes({
//  @Index("target"),
//  @Index("perspective"),
//  @Index("compo")
//})
public class Passage extends Model {

  public String target;
  public String perspective;
  public String compo;
  public Double compoOrder;
  public String sha;

  public Passage(String target, String perspective, String compo, Double compoOrder, String sha) {
    this.target = target;
    this.perspective = perspective;
    this.compo = compo;
    this.compoOrder = compoOrder;
    this.sha = sha;
  } 
}
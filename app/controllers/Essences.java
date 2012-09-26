package controllers;

import java.lang.reflect.Constructor;
import java.util.*;

import play.*;
import play.mvc.*;

import models.*;
 
public class Essences extends CRUD {

  
  public static void create() throws Exception {
  	String content = params.get("object.content");
  	Logger.info("content=" + content);
  	Essence essence = new Essence(content);
  	essence.save();
  	redirect(request.controller + ".list");
  }
  
  /*
  @After(only={"create"})
  static void createSentence() {
    Sentence sentence = Sentence.findById(params.get("id", Long.class));
    sentence.sha = DigestUtils.shaHex(sentence.content);
    sentence.size = sentence.content.length();
    sentence.save();

    String target = params.get("passage.target");
    String perspective = params.get("passage.perspective");
    Double compoOrder = params.get("compo.compoOrder", Double.class);

    Passage passage = Passage.find("bySha", DigestUtils.shaHex(target+perspective)).first();
    passage.addCompo(sentence.sha, sentence.size, compoOrder, "", "", "http://test");

  }
  */

  /*
  // override CRUD.java
  public static void create() throws Exception {
    ObjectType type = ObjectType.get(getControllerClass());
    notFoundIfNull(type);
    Constructor<?> constructor = type.entityClass.getDeclaredConstructor();
    constructor.setAccessible(true);
    Model object = (Model) constructor.newInstance();
    Binder.bindBean(params.getRootParamNode(), "object", object);
    validation.valid(object);
    if (validation.hasErrors()) {
      renderArgs.put("error", play.i18n.Messages.get("crud.hasErrors"));
      try {
        render(request.controller.replace(".", "/") + "/blank.html", type, object);
      } catch (TemplateNotFoundException e) {
        render("CRUD/blank.html", type, object);
      }
    }
    object._save();
    params.put("id", object._key() + "");

    flash.success(play.i18n.Messages.get("crud.created", type.modelName));
    if (params.get("_save") != null) {
      redirect(request.controller + ".list");
    }
    if (params.get("_saveAndAddAnother") != null) {
      redirect(request.controller + ".blank");
    }
    redirect(request.controller + ".show", object._key());
  }
  */

}

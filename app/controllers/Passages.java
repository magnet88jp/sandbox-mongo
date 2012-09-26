package controllers;

import java.lang.reflect.Constructor;
import java.util.*;

import play.*;
import play.mvc.*;

import models.*;
 
public class Passages extends CRUD {

  public static void create() throws Exception {
  	String target = params.get("object.target");
  	String perspective = params.get("object.perspective");
  	String compo = params.get("object.compo");
  	Double compoOrder = params.get("object.compoOrder", Double.class);
  	String sha = params.get("object.sha");
  	Logger.info("sha=" + sha);
  	Passage passage = new Passage(target, perspective, compo, compoOrder, sha);
  	passage.save();
  	redirect(request.controller + ".list");
  }
}
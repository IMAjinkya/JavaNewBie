package com.rtti.petExample;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
  
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "com.rtti.petExample.Mutt",
    "com.rtti.petExample.Pug",
    "com.rtti.petExample.EgyptianMau",
    "com.rtti.petExample.Manx",
    "com.rtti.petExample.Cymric",
    "com.rtti.petExample.Rat",
    "com.rtti.petExample.Mouse",
    "com.rtti.petExample.Hamster"
  };	
  
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name)
        );
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  
  static { loader(); }
  
  public List<Class<? extends Pet>> types() {return types;}
}

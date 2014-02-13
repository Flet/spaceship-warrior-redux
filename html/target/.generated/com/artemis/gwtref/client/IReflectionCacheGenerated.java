package com.artemis.gwtref.client;

import java.security.AccessControlException;
import java.util.*;
import com.artemis.gwtref.client.*;

public class IReflectionCacheGenerated implements com.artemis.gwtref.client.IReflectionCache {
  Map<String, Type> types = new HashMap<String, Type>();
  private void c0() {
  Type p = new Type();
  p.name = "boolean";
  p.id = 0;
  p.clazz = boolean.class;
  p.isPrimitive = true;
  types.put("boolean", p);
  
  }
  
  private void c1() {
  Type p = new Type();
  p.name = "char";
  p.id = 1;
  p.clazz = char.class;
  p.isPrimitive = true;
  types.put("char", p);
  
  }
  
  private void c2() {
  Type t = new Type();
  t.name = "com.artemis.Component";
  t.id = 2;
  t.clazz = com.artemis.Component.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  };
  types.put("com.artemis.Component", t);
  
  }
  
  private void c3() {
  Type t = new Type();
  t.name = "com.artemis.ComponentManager";
  t.id = 3;
  t.clazz = com.artemis.ComponentManager.class;
  t.superClass = com.artemis.Manager.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.ComponentManager.class);
  tAssignables.add(com.artemis.Manager.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("componentsByType", com.artemis.ComponentManager.class, com.artemis.utils.Bag.class, true, false, true, false, false, false, false, false, 5, 4, new Class[] {com.artemis.utils.Bag.class, }, new String[]{}), 
  new Field("packedComponents", com.artemis.ComponentManager.class, com.artemis.utils.Bag.class, true, false, true, false, false, false, false, false, 7, 6, new Class[] {com.artemis.PackedComponent.class, }, new String[]{}), 
  new Field("packedComponentOwners", com.artemis.ComponentManager.class, com.artemis.utils.Bag.class, true, false, true, false, false, false, false, false, 9, 8, new Class[] {java.util.BitSet.class, }, new String[]{}), 
  new Field("deleted", com.artemis.ComponentManager.class, null, true, false, true, false, false, false, false, false, 11, 10, new Class[] {com.artemis.Entity.class, }, new String[]{}), 
  new Field("pooledComponents", com.artemis.ComponentManager.class, null, true, false, true, false, false, false, false, false, 13, 12, null, new String[]{}), 
  new Field("entityContainerSize", com.artemis.ComponentManager.class, int.class, false, false, true, false, false, false, false, false, 15, 14, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("create", 
  com.artemis.ComponentManager.class, 
  com.artemis.Component.class, 
  new Parameter[] {
  new Parameter("owner", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("componentClass", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 16),
  new Method("getPackedComponentOwners", 
  com.artemis.ComponentManager.class, 
  java.util.BitSet.class, 
  new Parameter[] {
  new Parameter("type", com.artemis.ComponentType.class, "Lcom/artemis/ComponentType;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 17),
  new Method("newInstance", 
  com.artemis.ComponentManager.class, 
  com.artemis.Component.class, 
  new Parameter[] {
  new Parameter("componentClass", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, 18),
  new Method("removeComponentsOfEntity", 
  com.artemis.ComponentManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, 19),
  new Method("addComponent", 
  com.artemis.ComponentManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("type", com.artemis.ComponentType.class, "Lcom/artemis/ComponentType;"), 
  new Parameter("component", com.artemis.Component.class, "Lcom/artemis/Component;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 20),
  new Method("addPackedComponent", 
  com.artemis.ComponentManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("type", com.artemis.ComponentType.class, "Lcom/artemis/ComponentType;"), 
  new Parameter("component", com.artemis.PackedComponent.class, "Lcom/artemis/PackedComponent;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, 21),
  new Method("addBasicComponent", 
  com.artemis.ComponentManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("type", com.artemis.ComponentType.class, "Lcom/artemis/ComponentType;"), 
  new Parameter("component", com.artemis.Component.class, "Lcom/artemis/Component;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, 22),
  new Method("removeComponent", 
  com.artemis.ComponentManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("type", com.artemis.ComponentType.class, "Lcom/artemis/ComponentType;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 23),
  new Method("getComponentsByType", 
  com.artemis.ComponentManager.class, 
  com.artemis.utils.Bag.class, 
  new Parameter[] {
  new Parameter("type", com.artemis.ComponentType.class, "Lcom/artemis/ComponentType;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 24),
  new Method("getComponent", 
  com.artemis.ComponentManager.class, 
  com.artemis.Component.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("type", com.artemis.ComponentType.class, "Lcom/artemis/ComponentType;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 25),
  new Method("getComponentsFor", 
  com.artemis.ComponentManager.class, 
  com.artemis.utils.Bag.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("fillBag", com.artemis.utils.Bag.class, "Lcom/artemis/utils/Bag;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 26),
  new Method("deleted", 
  com.artemis.ComponentManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 27),
  new Method("clean", 
  com.artemis.ComponentManager.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 28),
  };
  t.constructors = new Constructor[] {
  new Constructor("ComponentManager", 
  com.artemis.ComponentManager.class, 
  com.artemis.ComponentManager.class, 
  new Parameter[] {
  new Parameter("entityContainerSize", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 29),
  };
  types.put("com.artemis.ComponentManager", t);
  
  }
  
  private void c4() {
  Type t = new Type();
  t.name = "com.artemis.ComponentMapper";
  t.id = 30;
  t.clazz = com.artemis.ComponentMapper.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.ComponentMapper.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("get", 
  com.artemis.ComponentMapper.class, 
  com.artemis.Component.class, 
  new Parameter[] {
  new Parameter("arg0", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  true, false, false, false, false, false, true, true, false, true, false, 31),
  new Method("get", 
  com.artemis.ComponentMapper.class, 
  com.artemis.Component.class, 
  new Parameter[] {
  new Parameter("arg0", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  true, false, false, false, false, false, true, true, false, true, false, 32),
  new Method("getSafe", 
  com.artemis.ComponentMapper.class, 
  com.artemis.Component.class, 
  new Parameter[] {
  new Parameter("arg0", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  true, false, false, false, false, false, true, true, false, true, false, 33),
  new Method("getSafe", 
  com.artemis.ComponentMapper.class, 
  com.artemis.Component.class, 
  new Parameter[] {
  new Parameter("arg0", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  true, false, false, false, false, false, true, true, false, true, false, 34),
  new Method("has", 
  com.artemis.ComponentMapper.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  true, false, false, false, false, false, true, true, false, true, false, 35),
  new Method("getFor", 
  com.artemis.ComponentMapper.class, 
  com.artemis.ComponentMapper.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Class.class, "Ljava/lang/Class;"), 
  new Parameter("arg1", com.artemis.World.class, "Lcom/artemis/World;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 36),
  };
  types.put("com.artemis.ComponentMapper", t);
  
  }
  
  private void c5() {
  Type t = new Type();
  t.name = "com.artemis.ComponentType";
  t.id = 37;
  t.clazz = com.artemis.ComponentType.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.ComponentType.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("componentTypes", com.artemis.ComponentType.class, java.util.IdentityHashMap.class, true, false, true, false, false, true, false, false, 39, 38, new Class[] {java.lang.Class.class, com.artemis.ComponentType.class, }, new String[]{}), 
  new Field("INDEX", com.artemis.ComponentType.class, int.class, false, false, true, false, false, true, false, false, 41, 40, null, new String[]{}), 
  new Field("index", com.artemis.ComponentType.class, int.class, true, false, true, false, false, false, false, false, 43, 42, null, new String[]{}), 
  new Field("type", com.artemis.ComponentType.class, java.lang.Class.class, true, false, true, false, false, false, false, false, 45, 44, new Class[] {Object.class, }, new String[]{}), 
  new Field("taxonomy", com.artemis.ComponentType.class, null, true, false, true, false, false, false, false, false, 47, 46, null, new String[]{}), 
  new Field("types", com.artemis.ComponentType.class, com.artemis.utils.Bag.class, true, false, true, false, false, true, false, false, 49, 48, new Class[] {com.artemis.ComponentType.class, }, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("getIndex", 
  com.artemis.ComponentType.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 50),
  new Method("toString", 
  com.artemis.ComponentType.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 51),
  new Method("getTaxonomy", 
  com.artemis.ComponentType.class, 
  null, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 52),
  new Method("getTaxonomy", 
  com.artemis.ComponentType.class, 
  null, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, true, false, false, true, false, false, false, true, false, 53),
  new Method("isPackedComponent", 
  com.artemis.ComponentType.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 54),
  new Method("isPackedComponent", 
  com.artemis.ComponentType.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, true, false, false, true, false, false, false, true, false, 55),
  new Method("getType", 
  com.artemis.ComponentType.class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 56),
  new Method("getTypeFor", 
  com.artemis.ComponentType.class, 
  com.artemis.ComponentType.class, 
  new Parameter[] {
  new Parameter("c", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 57),
  new Method("getTypeFor", 
  com.artemis.ComponentType.class, 
  com.artemis.ComponentType.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 58),
  new Method("getIndexFor", 
  com.artemis.ComponentType.class, 
  int.class, 
  new Parameter[] {
  new Parameter("c", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 59),
  };
  t.constructors = new Constructor[] {
  new Constructor("ComponentType", 
  com.artemis.ComponentType.class, 
  com.artemis.ComponentType.class, 
  new Parameter[] {
  new Parameter("type", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 60),
  };
  types.put("com.artemis.ComponentType", t);
  
  }
  
  private void c6() {
  Type t = new Type();
  t.name = "com.artemis.EntityManager";
  t.id = 61;
  t.clazz = com.artemis.EntityManager.class;
  t.superClass = com.artemis.Manager.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.EntityManager.class);
  tAssignables.add(com.artemis.Manager.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("entities", com.artemis.EntityManager.class, com.artemis.utils.Bag.class, true, false, true, false, false, false, false, false, 63, 62, new Class[] {com.artemis.Entity.class, }, new String[]{}), 
  new Field("disabled", com.artemis.EntityManager.class, java.util.BitSet.class, true, false, true, false, false, false, false, false, 65, 64, null, new String[]{}), 
  new Field("active", com.artemis.EntityManager.class, int.class, false, false, true, false, false, false, false, false, 67, 66, null, new String[]{}), 
  new Field("added", com.artemis.EntityManager.class, long.class, false, false, true, false, false, false, false, false, 69, 68, null, new String[]{}), 
  new Field("created", com.artemis.EntityManager.class, long.class, false, false, true, false, false, false, false, false, 71, 70, null, new String[]{}), 
  new Field("deleted", com.artemis.EntityManager.class, long.class, false, false, true, false, false, false, false, false, 73, 72, null, new String[]{}), 
  new Field("recyclingEntityFactory", com.artemis.EntityManager.class, null, false, false, true, false, false, false, false, false, 75, 74, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  com.artemis.EntityManager.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 76),
  new Method("createEntityInstance", 
  com.artemis.EntityManager.class, 
  com.artemis.Entity.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 77),
  new Method("added", 
  com.artemis.EntityManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 78),
  new Method("enabled", 
  com.artemis.EntityManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 79),
  new Method("disabled", 
  com.artemis.EntityManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 80),
  new Method("deleted", 
  com.artemis.EntityManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 81),
  new Method("isActive", 
  com.artemis.EntityManager.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("entityId", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 82),
  new Method("isEnabled", 
  com.artemis.EntityManager.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("entityId", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 83),
  new Method("getEntity", 
  com.artemis.EntityManager.class, 
  com.artemis.Entity.class, 
  new Parameter[] {
  new Parameter("entityId", int.class, "I"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 84),
  new Method("getActiveEntityCount", 
  com.artemis.EntityManager.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 85),
  new Method("getTotalCreated", 
  com.artemis.EntityManager.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 86),
  new Method("getTotalAdded", 
  com.artemis.EntityManager.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 87),
  new Method("getTotalDeleted", 
  com.artemis.EntityManager.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 88),
  new Method("clean", 
  com.artemis.EntityManager.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 89),
  };
  t.constructors = new Constructor[] {
  new Constructor("EntityManager", 
  com.artemis.EntityManager.class, 
  com.artemis.EntityManager.class, 
  new Parameter[] {
  new Parameter("initialContainerSize", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 90),
  };
  types.put("com.artemis.EntityManager", t);
  
  }
  
  private void c7() {
  Type t = new Type();
  t.name = "com.artemis.PackedComponent";
  t.id = 91;
  t.clazz = com.artemis.PackedComponent.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.PackedComponent.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("forEntity", 
  com.artemis.PackedComponent.class, 
  com.artemis.PackedComponent.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  true, false, false, false, false, true, false, true, false, true, false, 92),
  new Method("reset", 
  com.artemis.PackedComponent.class, 
  void.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, true, false, true, false, true, false, 93),
  };
  types.put("com.artemis.PackedComponent", t);
  
  }
  
  private void c8() {
  Type t = new Type();
  t.name = "com.artemis.PooledComponent";
  t.id = 94;
  t.clazz = com.artemis.PooledComponent.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.PooledComponent.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("reset", 
  com.artemis.PooledComponent.class, 
  void.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, true, false, true, false, true, false, 95),
  };
  types.put("com.artemis.PooledComponent", t);
  
  }
  
  private void c9() {
  Type t = new Type();
  t.name = "com.artemis.annotations.Mapper";
  t.id = 96;
  t.clazz = com.artemis.annotations.Mapper.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.annotations.Mapper.class);
  tAssignables.add(java.lang.annotation.Annotation.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  };
  types.put("com.artemis.annotations.Mapper", t);
  
  }
  
  private void c10() {
  Type t = new Type();
  t.name = "com.artemis.managers.GroupManager";
  t.id = 97;
  t.clazz = com.artemis.managers.GroupManager.class;
  t.superClass = com.artemis.Manager.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.managers.GroupManager.class);
  tAssignables.add(com.artemis.Manager.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("EMPTY_BAG", com.artemis.managers.GroupManager.class, com.artemis.utils.ImmutableBag.class, true, false, true, false, false, true, false, false, 99, 98, new Class[] {java.lang.String.class, }, new String[]{}), 
  new Field("entitiesByGroup", com.artemis.managers.GroupManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 101, 100, new Class[] {java.lang.String.class, com.artemis.utils.Bag.class, }, new String[]{}), 
  new Field("groupsByEntity", com.artemis.managers.GroupManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 103, 102, new Class[] {com.artemis.Entity.class, com.artemis.utils.Bag.class, }, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  com.artemis.managers.GroupManager.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 104),
  new Method("add", 
  com.artemis.managers.GroupManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("group", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 105),
  new Method("remove", 
  com.artemis.managers.GroupManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("group", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 106),
  new Method("removeFromAllGroups", 
  com.artemis.managers.GroupManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 107),
  new Method("getEntities", 
  com.artemis.managers.GroupManager.class, 
  com.artemis.utils.ImmutableBag.class, 
  new Parameter[] {
  new Parameter("group", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 108),
  new Method("getGroups", 
  com.artemis.managers.GroupManager.class, 
  com.artemis.utils.ImmutableBag.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 109),
  new Method("isInAnyGroup", 
  com.artemis.managers.GroupManager.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 110),
  new Method("isInGroup", 
  com.artemis.managers.GroupManager.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("group", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 111),
  new Method("deleted", 
  com.artemis.managers.GroupManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 112),
  };
  t.constructors = new Constructor[] {
  new Constructor("GroupManager", 
  com.artemis.managers.GroupManager.class, 
  com.artemis.managers.GroupManager.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 113),
  };
  types.put("com.artemis.managers.GroupManager", t);
  
  }
  
  private void c11() {
  Type t = new Type();
  t.name = "com.artemis.managers.PlayerManager";
  t.id = 114;
  t.clazz = com.artemis.managers.PlayerManager.class;
  t.superClass = com.artemis.Manager.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.managers.PlayerManager.class);
  tAssignables.add(com.artemis.Manager.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("playerByEntity", com.artemis.managers.PlayerManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 116, 115, new Class[] {com.artemis.Entity.class, java.lang.String.class, }, new String[]{}), 
  new Field("entitiesByPlayer", com.artemis.managers.PlayerManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 118, 117, new Class[] {java.lang.String.class, com.artemis.utils.Bag.class, }, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("setPlayer", 
  com.artemis.managers.PlayerManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("player", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 119),
  new Method("getEntitiesOfPlayer", 
  com.artemis.managers.PlayerManager.class, 
  com.artemis.utils.ImmutableBag.class, 
  new Parameter[] {
  new Parameter("player", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 120),
  new Method("removeFromPlayer", 
  com.artemis.managers.PlayerManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 121),
  new Method("getPlayer", 
  com.artemis.managers.PlayerManager.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 122),
  new Method("initialize", 
  com.artemis.managers.PlayerManager.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 123),
  new Method("deleted", 
  com.artemis.managers.PlayerManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 124),
  };
  t.constructors = new Constructor[] {
  new Constructor("PlayerManager", 
  com.artemis.managers.PlayerManager.class, 
  com.artemis.managers.PlayerManager.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 125),
  };
  types.put("com.artemis.managers.PlayerManager", t);
  
  }
  
  private void c12() {
  Type t = new Type();
  t.name = "com.artemis.managers.TagManager";
  t.id = 126;
  t.clazz = com.artemis.managers.TagManager.class;
  t.superClass = com.artemis.Manager.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.managers.TagManager.class);
  tAssignables.add(com.artemis.Manager.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("entitiesByTag", com.artemis.managers.TagManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 128, 127, new Class[] {java.lang.String.class, com.artemis.Entity.class, }, new String[]{}), 
  new Field("tagsByEntity", com.artemis.managers.TagManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 130, 129, new Class[] {com.artemis.Entity.class, java.lang.String.class, }, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("register", 
  com.artemis.managers.TagManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("tag", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 131),
  new Method("unregister", 
  com.artemis.managers.TagManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("tag", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 132),
  new Method("isRegistered", 
  com.artemis.managers.TagManager.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("tag", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 133),
  new Method("getEntity", 
  com.artemis.managers.TagManager.class, 
  com.artemis.Entity.class, 
  new Parameter[] {
  new Parameter("tag", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 134),
  new Method("getRegisteredTags", 
  com.artemis.managers.TagManager.class, 
  java.util.Collection.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 135),
  new Method("deleted", 
  com.artemis.managers.TagManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 136),
  new Method("initialize", 
  com.artemis.managers.TagManager.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 137),
  };
  t.constructors = new Constructor[] {
  new Constructor("TagManager", 
  com.artemis.managers.TagManager.class, 
  com.artemis.managers.TagManager.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 138),
  };
  types.put("com.artemis.managers.TagManager", t);
  
  }
  
  private void c13() {
  Type t = new Type();
  t.name = "com.artemis.managers.TeamManager";
  t.id = 139;
  t.clazz = com.artemis.managers.TeamManager.class;
  t.superClass = com.artemis.Manager.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.artemis.managers.TeamManager.class);
  tAssignables.add(com.artemis.Manager.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("playersByTeam", com.artemis.managers.TeamManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 141, 140, new Class[] {java.lang.String.class, com.artemis.utils.Bag.class, }, new String[]{}), 
  new Field("teamByPlayer", com.artemis.managers.TeamManager.class, java.util.Map.class, true, false, true, false, false, false, false, false, 143, 142, new Class[] {java.lang.String.class, java.lang.String.class, }, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  com.artemis.managers.TeamManager.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 144),
  new Method("getTeam", 
  com.artemis.managers.TeamManager.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("player", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 145),
  new Method("setTeam", 
  com.artemis.managers.TeamManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("player", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("team", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 146),
  new Method("getPlayers", 
  com.artemis.managers.TeamManager.class, 
  com.artemis.utils.ImmutableBag.class, 
  new Parameter[] {
  new Parameter("team", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 147),
  new Method("removeFromTeam", 
  com.artemis.managers.TeamManager.class, 
  void.class, 
  new Parameter[] {
  new Parameter("player", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 148),
  };
  t.constructors = new Constructor[] {
  new Constructor("TeamManager", 
  com.artemis.managers.TeamManager.class, 
  com.artemis.managers.TeamManager.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 149),
  };
  types.put("com.artemis.managers.TeamManager", t);
  
  }
  
  private void c14() {
  Type p = new Type();
  p.name = "float";
  p.id = 150;
  p.clazz = float.class;
  p.isPrimitive = true;
  types.put("float", p);
  
  }
  
  private void c15() {
  Type p = new Type();
  p.name = "int";
  p.id = 151;
  p.clazz = int.class;
  p.isPrimitive = true;
  types.put("int", p);
  
  }
  
  private void c16() {
  Type p = new Type();
  p.name = "long";
  p.id = 152;
  p.clazz = long.class;
  p.isPrimitive = true;
  types.put("long", p);
  
  }
  
  private void c17() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Bounds";
  t.id = 153;
  t.clazz = net.brokenspork.components.Bounds.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Bounds.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("radius", net.brokenspork.components.Bounds.class, float.class, false, false, false, false, true, false, false, false, 155, 154, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Bounds", 
  net.brokenspork.components.Bounds.class, 
  net.brokenspork.components.Bounds.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 156),
  };
  types.put("net.brokenspork.components.Bounds", t);
  
  }
  
  private void c18() {
  Type t = new Type();
  t.name = "net.brokenspork.components.ColorAnimation";
  t.id = 157;
  t.clazz = net.brokenspork.components.ColorAnimation.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.ColorAnimation.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("redMin", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 159, 158, null, new String[]{}), 
  new Field("redMax", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 161, 160, null, new String[]{}), 
  new Field("redSpeed", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 163, 162, null, new String[]{}), 
  new Field("greenMin", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 165, 164, null, new String[]{}), 
  new Field("greenMax", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 167, 166, null, new String[]{}), 
  new Field("greenSpeed", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 169, 168, null, new String[]{}), 
  new Field("blueMin", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 171, 170, null, new String[]{}), 
  new Field("blueMax", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 173, 172, null, new String[]{}), 
  new Field("blueSpeed", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 175, 174, null, new String[]{}), 
  new Field("alphaMin", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 177, 176, null, new String[]{}), 
  new Field("alphaMax", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 179, 178, null, new String[]{}), 
  new Field("alphaSpeed", net.brokenspork.components.ColorAnimation.class, float.class, false, false, false, false, true, false, false, false, 181, 180, null, new String[]{}), 
  new Field("redAnimate", net.brokenspork.components.ColorAnimation.class, boolean.class, false, false, false, false, true, false, false, false, 183, 182, null, new String[]{}), 
  new Field("greenAnimate", net.brokenspork.components.ColorAnimation.class, boolean.class, false, false, false, false, true, false, false, false, 185, 184, null, new String[]{}), 
  new Field("blueAnimate", net.brokenspork.components.ColorAnimation.class, boolean.class, false, false, false, false, true, false, false, false, 187, 186, null, new String[]{}), 
  new Field("alphaAnimate", net.brokenspork.components.ColorAnimation.class, boolean.class, false, false, false, false, true, false, false, false, 189, 188, null, new String[]{}), 
  new Field("repeat", net.brokenspork.components.ColorAnimation.class, boolean.class, false, false, false, false, true, false, false, false, 191, 190, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("ColorAnimation", 
  net.brokenspork.components.ColorAnimation.class, 
  net.brokenspork.components.ColorAnimation.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 192),
  };
  types.put("net.brokenspork.components.ColorAnimation", t);
  
  }
  
  private void c19() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Enemy";
  t.id = 193;
  t.clazz = net.brokenspork.components.Enemy.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Enemy.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Enemy", 
  net.brokenspork.components.Enemy.class, 
  net.brokenspork.components.Enemy.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 194),
  };
  types.put("net.brokenspork.components.Enemy", t);
  
  }
  
  private void c20() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Expires";
  t.id = 195;
  t.clazz = net.brokenspork.components.Expires.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Expires.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("delay", net.brokenspork.components.Expires.class, float.class, false, false, false, false, true, false, false, false, 197, 196, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Expires", 
  net.brokenspork.components.Expires.class, 
  net.brokenspork.components.Expires.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 198),
  };
  types.put("net.brokenspork.components.Expires", t);
  
  }
  
  private void c21() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Health";
  t.id = 199;
  t.clazz = net.brokenspork.components.Health.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Health.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("health", net.brokenspork.components.Health.class, float.class, false, false, false, false, true, false, false, false, 201, 200, null, new String[]{}), 
  new Field("maximumHealth", net.brokenspork.components.Health.class, float.class, false, false, false, false, true, false, false, false, 203, 202, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Health", 
  net.brokenspork.components.Health.class, 
  net.brokenspork.components.Health.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 204),
  };
  types.put("net.brokenspork.components.Health", t);
  
  }
  
  private void c22() {
  Type t = new Type();
  t.name = "net.brokenspork.components.ParallaxStar";
  t.id = 205;
  t.clazz = net.brokenspork.components.ParallaxStar.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.ParallaxStar.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("ParallaxStar", 
  net.brokenspork.components.ParallaxStar.class, 
  net.brokenspork.components.ParallaxStar.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 206),
  };
  types.put("net.brokenspork.components.ParallaxStar", t);
  
  }
  
  private void c23() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Player";
  t.id = 207;
  t.clazz = net.brokenspork.components.Player.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Player.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Player", 
  net.brokenspork.components.Player.class, 
  net.brokenspork.components.Player.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 208),
  };
  types.put("net.brokenspork.components.Player", t);
  
  }
  
  private void c24() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Position";
  t.id = 209;
  t.clazz = net.brokenspork.components.Position.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Position.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("x", net.brokenspork.components.Position.class, float.class, false, false, false, false, true, false, false, false, 211, 210, null, new String[]{}), 
  new Field("y", net.brokenspork.components.Position.class, float.class, false, false, false, false, true, false, false, false, 213, 212, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Position", 
  net.brokenspork.components.Position.class, 
  net.brokenspork.components.Position.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 214),
  };
  types.put("net.brokenspork.components.Position", t);
  
  }
  
  private void c25() {
  Type t = new Type();
  t.name = "net.brokenspork.components.ScaleAnimation";
  t.id = 215;
  t.clazz = net.brokenspork.components.ScaleAnimation.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.ScaleAnimation.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("min", net.brokenspork.components.ScaleAnimation.class, float.class, false, false, false, false, true, false, false, false, 217, 216, null, new String[]{}), 
  new Field("max", net.brokenspork.components.ScaleAnimation.class, float.class, false, false, false, false, true, false, false, false, 219, 218, null, new String[]{}), 
  new Field("speed", net.brokenspork.components.ScaleAnimation.class, float.class, false, false, false, false, true, false, false, false, 221, 220, null, new String[]{}), 
  new Field("repeat", net.brokenspork.components.ScaleAnimation.class, boolean.class, false, false, false, false, true, false, false, false, 223, 222, null, new String[]{}), 
  new Field("active", net.brokenspork.components.ScaleAnimation.class, boolean.class, false, false, false, false, true, false, false, false, 225, 224, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("ScaleAnimation", 
  net.brokenspork.components.ScaleAnimation.class, 
  net.brokenspork.components.ScaleAnimation.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 226),
  };
  types.put("net.brokenspork.components.ScaleAnimation", t);
  
  }
  
  private void c26() {
  Type t = new Type();
  t.name = "net.brokenspork.components.SoundEffect";
  t.id = 227;
  t.clazz = net.brokenspork.components.SoundEffect.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.SoundEffect.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("effect", net.brokenspork.components.SoundEffect.class, net.brokenspork.components.SoundEffect.EFFECT.class, false, false, false, false, true, false, false, false, 229, 228, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("SoundEffect", 
  net.brokenspork.components.SoundEffect.class, 
  net.brokenspork.components.SoundEffect.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 230),
  };
  types.put("net.brokenspork.components.SoundEffect", t);
  
  }
  
  private void c27() {
  Type t = new Type();
  t.name = "net.brokenspork.components.SoundEffect.EFFECT";
  t.id = 231;
  t.clazz = net.brokenspork.components.SoundEffect.EFFECT.class;
  t.superClass = java.lang.Enum.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.SoundEffect.EFFECT.class);
  tAssignables.add(java.lang.Enum.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isEnum = true;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("PEW", net.brokenspork.components.SoundEffect.EFFECT.class, net.brokenspork.components.SoundEffect.EFFECT.class, true, false, false, false, true, true, false, false, 233, 232, null, new String[]{}), 
  new Field("ASPLODE", net.brokenspork.components.SoundEffect.EFFECT.class, net.brokenspork.components.SoundEffect.EFFECT.class, true, false, false, false, true, true, false, false, 235, 234, null, new String[]{}), 
  new Field("SMALLASPLODE", net.brokenspork.components.SoundEffect.EFFECT.class, net.brokenspork.components.SoundEffect.EFFECT.class, true, false, false, false, true, true, false, false, 237, 236, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("values", 
  net.brokenspork.components.SoundEffect.EFFECT.class, 
  net.brokenspork.components.SoundEffect.EFFECT[].class, 
  new Parameter[] {
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 238),
  new Method("valueOf", 
  net.brokenspork.components.SoundEffect.EFFECT.class, 
  net.brokenspork.components.SoundEffect.EFFECT.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 239),
  };
  t.constructors = new Constructor[] {
  };
  t.enumConstants = new Object[3];
  t.enumConstants[0] = net.brokenspork.components.SoundEffect.EFFECT.PEW;
  t.enumConstants[1] = net.brokenspork.components.SoundEffect.EFFECT.ASPLODE;
  t.enumConstants[2] = net.brokenspork.components.SoundEffect.EFFECT.SMALLASPLODE;
  types.put("net.brokenspork.components.SoundEffect.EFFECT", t);
  
  }
  
  private void c28() {
  Type t = new Type();
  t.name = "net.brokenspork.components.SoundEffect.EFFECT[]";
  t.id = 240;
  t.clazz = net.brokenspork.components.SoundEffect.EFFECT[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.SoundEffect.EFFECT[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  net.brokenspork.components.SoundEffect.EFFECT[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 241),
  new Method("getClass", 
  net.brokenspork.components.SoundEffect.EFFECT[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 242),
  new Method("hashCode", 
  net.brokenspork.components.SoundEffect.EFFECT[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 243),
  new Method("toString", 
  net.brokenspork.components.SoundEffect.EFFECT[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 244),
  new Method("finalize", 
  net.brokenspork.components.SoundEffect.EFFECT[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 245),
  };
  t.constructors = new Constructor[] {
  };
  t.componentType = net.brokenspork.components.SoundEffect.EFFECT.class;
  types.put("net.brokenspork.components.SoundEffect.EFFECT[]", t);
  
  }
  
  private void c29() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Sprite";
  t.id = 246;
  t.clazz = net.brokenspork.components.Sprite.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Sprite.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("name", net.brokenspork.components.Sprite.class, java.lang.String.class, false, false, false, false, true, false, false, false, 248, 247, null, new String[]{}), 
  new Field("scaleX", net.brokenspork.components.Sprite.class, float.class, false, false, false, false, true, false, false, false, 250, 249, null, new String[]{}), 
  new Field("scaleY", net.brokenspork.components.Sprite.class, float.class, false, false, false, false, true, false, false, false, 252, 251, null, new String[]{}), 
  new Field("rotation", net.brokenspork.components.Sprite.class, float.class, false, false, false, false, true, false, false, false, 254, 253, null, new String[]{}), 
  new Field("r", net.brokenspork.components.Sprite.class, float.class, false, false, false, false, true, false, false, false, 256, 255, null, new String[]{}), 
  new Field("g", net.brokenspork.components.Sprite.class, float.class, false, false, false, false, true, false, false, false, 258, 257, null, new String[]{}), 
  new Field("b", net.brokenspork.components.Sprite.class, float.class, false, false, false, false, true, false, false, false, 260, 259, null, new String[]{}), 
  new Field("a", net.brokenspork.components.Sprite.class, float.class, false, false, false, false, true, false, false, false, 262, 261, null, new String[]{}), 
  new Field("layer", net.brokenspork.components.Sprite.class, net.brokenspork.components.Sprite.Layer.class, false, false, false, false, true, false, false, false, 264, 263, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Sprite", 
  net.brokenspork.components.Sprite.class, 
  net.brokenspork.components.Sprite.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 265),
  };
  types.put("net.brokenspork.components.Sprite", t);
  
  }
  
  private void c30() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Sprite.Layer";
  t.id = 266;
  t.clazz = net.brokenspork.components.Sprite.Layer.class;
  t.superClass = java.lang.Enum.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Sprite.Layer.class);
  tAssignables.add(java.lang.Enum.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isEnum = true;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("DEFAULT", net.brokenspork.components.Sprite.Layer.class, net.brokenspork.components.Sprite.Layer.class, true, false, false, false, true, true, false, false, 268, 267, null, new String[]{}), 
  new Field("BACKGROUND", net.brokenspork.components.Sprite.Layer.class, net.brokenspork.components.Sprite.Layer.class, true, false, false, false, true, true, false, false, 270, 269, null, new String[]{}), 
  new Field("ACTORS_1", net.brokenspork.components.Sprite.Layer.class, net.brokenspork.components.Sprite.Layer.class, true, false, false, false, true, true, false, false, 272, 271, null, new String[]{}), 
  new Field("ACTORS_2", net.brokenspork.components.Sprite.Layer.class, net.brokenspork.components.Sprite.Layer.class, true, false, false, false, true, true, false, false, 274, 273, null, new String[]{}), 
  new Field("ACTORS_3", net.brokenspork.components.Sprite.Layer.class, net.brokenspork.components.Sprite.Layer.class, true, false, false, false, true, true, false, false, 276, 275, null, new String[]{}), 
  new Field("PARTICLES", net.brokenspork.components.Sprite.Layer.class, net.brokenspork.components.Sprite.Layer.class, true, false, false, false, true, true, false, false, 278, 277, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("getLayerId", 
  net.brokenspork.components.Sprite.Layer.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 279),
  new Method("values", 
  net.brokenspork.components.Sprite.Layer.class, 
  net.brokenspork.components.Sprite.Layer[].class, 
  new Parameter[] {
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 280),
  new Method("valueOf", 
  net.brokenspork.components.Sprite.Layer.class, 
  net.brokenspork.components.Sprite.Layer.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, 281),
  };
  t.constructors = new Constructor[] {
  };
  t.enumConstants = new Object[6];
  t.enumConstants[0] = net.brokenspork.components.Sprite.Layer.DEFAULT;
  t.enumConstants[1] = net.brokenspork.components.Sprite.Layer.BACKGROUND;
  t.enumConstants[2] = net.brokenspork.components.Sprite.Layer.ACTORS_1;
  t.enumConstants[3] = net.brokenspork.components.Sprite.Layer.ACTORS_2;
  t.enumConstants[4] = net.brokenspork.components.Sprite.Layer.ACTORS_3;
  t.enumConstants[5] = net.brokenspork.components.Sprite.Layer.PARTICLES;
  types.put("net.brokenspork.components.Sprite.Layer", t);
  
  }
  
  private void c31() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Sprite.Layer[]";
  t.id = 282;
  t.clazz = net.brokenspork.components.Sprite.Layer[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Sprite.Layer[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  net.brokenspork.components.Sprite.Layer[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 283),
  new Method("getClass", 
  net.brokenspork.components.Sprite.Layer[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 284),
  new Method("hashCode", 
  net.brokenspork.components.Sprite.Layer[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 285),
  new Method("toString", 
  net.brokenspork.components.Sprite.Layer[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 286),
  new Method("finalize", 
  net.brokenspork.components.Sprite.Layer[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 287),
  };
  t.constructors = new Constructor[] {
  };
  t.componentType = net.brokenspork.components.Sprite.Layer.class;
  types.put("net.brokenspork.components.Sprite.Layer[]", t);
  
  }
  
  private void c32() {
  Type t = new Type();
  t.name = "net.brokenspork.components.Velocity";
  t.id = 288;
  t.clazz = net.brokenspork.components.Velocity.class;
  t.superClass = com.artemis.Component.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.components.Velocity.class);
  tAssignables.add(com.artemis.Component.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("vectorX", net.brokenspork.components.Velocity.class, float.class, false, false, false, false, true, false, false, false, 290, 289, null, new String[]{}), 
  new Field("vectorY", net.brokenspork.components.Velocity.class, float.class, false, false, false, false, true, false, false, false, 292, 291, null, new String[]{}), 
  };
  t.methods = new Method[] {
  };
  t.constructors = new Constructor[] {
  new Constructor("Velocity", 
  net.brokenspork.components.Velocity.class, 
  net.brokenspork.components.Velocity.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 293),
  };
  types.put("net.brokenspork.components.Velocity", t);
  
  }
  
  private void c33() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.CollisionSystem";
  t.id = 294;
  t.clazz = net.brokenspork.systems.CollisionSystem.class;
  t.superClass = com.artemis.EntitySystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.CollisionSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("pm", net.brokenspork.systems.CollisionSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 296, 295, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("bm", net.brokenspork.systems.CollisionSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 298, 297, new Class[] {net.brokenspork.components.Bounds.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("hm", net.brokenspork.systems.CollisionSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 300, 299, new Class[] {net.brokenspork.components.Health.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("ex", net.brokenspork.systems.CollisionSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 302, 301, new Class[] {net.brokenspork.components.Expires.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("collisionPairs", net.brokenspork.systems.CollisionSystem.class, com.artemis.utils.Bag.class, false, false, true, false, false, false, false, false, 304, 303, new Class[] {null, }, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  net.brokenspork.systems.CollisionSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 305),
  new Method("processEntities", 
  net.brokenspork.systems.CollisionSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("entities", com.artemis.utils.ImmutableBag.class, "Lcom/artemis/utils/ImmutableBag;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 306),
  new Method("checkProcessing", 
  net.brokenspork.systems.CollisionSystem.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 307),
  };
  t.constructors = new Constructor[] {
  new Constructor("CollisionSystem", 
  net.brokenspork.systems.CollisionSystem.class, 
  net.brokenspork.systems.CollisionSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 308),
  };
  types.put("net.brokenspork.systems.CollisionSystem", t);
  
  }
  
  private void c34() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.ColorAnimationSystem";
  t.id = 309;
  t.clazz = net.brokenspork.systems.ColorAnimationSystem.class;
  t.superClass = com.artemis.systems.EntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.ColorAnimationSystem.class);
  tAssignables.add(com.artemis.systems.EntityProcessingSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("cam", net.brokenspork.systems.ColorAnimationSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 311, 310, new Class[] {net.brokenspork.components.ColorAnimation.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("sm", net.brokenspork.systems.ColorAnimationSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 313, 312, new Class[] {net.brokenspork.components.Sprite.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  };
  t.methods = new Method[] {
  new Method("process", 
  net.brokenspork.systems.ColorAnimationSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 314),
  };
  t.constructors = new Constructor[] {
  new Constructor("ColorAnimationSystem", 
  net.brokenspork.systems.ColorAnimationSystem.class, 
  net.brokenspork.systems.ColorAnimationSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 315),
  };
  types.put("net.brokenspork.systems.ColorAnimationSystem", t);
  
  }
  
  private void c35() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.EntitySpawningTimerSystem";
  t.id = 316;
  t.clazz = net.brokenspork.systems.EntitySpawningTimerSystem.class;
  t.superClass = com.artemis.systems.VoidEntitySystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.EntitySpawningTimerSystem.class);
  tAssignables.add(com.artemis.systems.VoidEntitySystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("timer1", net.brokenspork.systems.EntitySpawningTimerSystem.class, com.artemis.utils.Timer.class, false, false, true, false, false, false, false, false, 318, 317, null, new String[]{}), 
  new Field("timer2", net.brokenspork.systems.EntitySpawningTimerSystem.class, com.artemis.utils.Timer.class, false, false, true, false, false, false, false, false, 320, 319, null, new String[]{}), 
  new Field("timer3", net.brokenspork.systems.EntitySpawningTimerSystem.class, com.artemis.utils.Timer.class, false, false, true, false, false, false, false, false, 322, 321, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("processSystem", 
  net.brokenspork.systems.EntitySpawningTimerSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 323),
  };
  t.constructors = new Constructor[] {
  new Constructor("EntitySpawningTimerSystem", 
  net.brokenspork.systems.EntitySpawningTimerSystem.class, 
  net.brokenspork.systems.EntitySpawningTimerSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 324),
  };
  types.put("net.brokenspork.systems.EntitySpawningTimerSystem", t);
  
  }
  
  private void c36() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.ExpiringSystem";
  t.id = 325;
  t.clazz = net.brokenspork.systems.ExpiringSystem.class;
  t.superClass = com.artemis.systems.DelayedEntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.ExpiringSystem.class);
  tAssignables.add(com.artemis.systems.DelayedEntityProcessingSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("em", net.brokenspork.systems.ExpiringSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 327, 326, new Class[] {net.brokenspork.components.Expires.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  };
  t.methods = new Method[] {
  new Method("processDelta", 
  net.brokenspork.systems.ExpiringSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  new Parameter("accumulatedDelta", float.class, "F"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 328),
  new Method("processExpired", 
  net.brokenspork.systems.ExpiringSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 329),
  new Method("getRemainingDelay", 
  net.brokenspork.systems.ExpiringSystem.class, 
  float.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 330),
  };
  t.constructors = new Constructor[] {
  new Constructor("ExpiringSystem", 
  net.brokenspork.systems.ExpiringSystem.class, 
  net.brokenspork.systems.ExpiringSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 331),
  };
  types.put("net.brokenspork.systems.ExpiringSystem", t);
  
  }
  
  private void c37() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.HealthRenderSystem";
  t.id = 332;
  t.clazz = net.brokenspork.systems.HealthRenderSystem.class;
  t.superClass = com.artemis.systems.EntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.HealthRenderSystem.class);
  tAssignables.add(com.artemis.systems.EntityProcessingSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("pm", net.brokenspork.systems.HealthRenderSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 334, 333, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("hm", net.brokenspork.systems.HealthRenderSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 336, 335, new Class[] {net.brokenspork.components.Health.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("batch", net.brokenspork.systems.HealthRenderSystem.class, com.badlogic.gdx.graphics.g2d.SpriteBatch.class, false, false, true, false, false, false, false, false, 338, 337, null, new String[]{}), 
  new Field("camera", net.brokenspork.systems.HealthRenderSystem.class, com.badlogic.gdx.graphics.OrthographicCamera.class, false, false, true, false, false, false, false, false, 340, 339, null, new String[]{}), 
  new Field("font", net.brokenspork.systems.HealthRenderSystem.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, true, false, false, false, false, false, 342, 341, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  net.brokenspork.systems.HealthRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 343),
  new Method("begin", 
  net.brokenspork.systems.HealthRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 344),
  new Method("process", 
  net.brokenspork.systems.HealthRenderSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 345),
  new Method("end", 
  net.brokenspork.systems.HealthRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 346),
  };
  t.constructors = new Constructor[] {
  new Constructor("HealthRenderSystem", 
  net.brokenspork.systems.HealthRenderSystem.class, 
  net.brokenspork.systems.HealthRenderSystem.class, 
  new Parameter[] {
  new Parameter("camera", com.badlogic.gdx.graphics.OrthographicCamera.class, "Lcom/badlogic/gdx/graphics/OrthographicCamera;"), 
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 347),
  };
  types.put("net.brokenspork.systems.HealthRenderSystem", t);
  
  }
  
  private void c38() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.HudRenderSystem";
  t.id = 348;
  t.clazz = net.brokenspork.systems.HudRenderSystem.class;
  t.superClass = com.artemis.systems.VoidEntitySystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.HudRenderSystem.class);
  tAssignables.add(com.artemis.systems.VoidEntitySystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("pm", net.brokenspork.systems.HudRenderSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 350, 349, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("sm", net.brokenspork.systems.HudRenderSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 352, 351, new Class[] {net.brokenspork.components.Sprite.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("regions", net.brokenspork.systems.HudRenderSystem.class, java.util.HashMap.class, false, false, true, false, false, false, false, false, 354, 353, new Class[] {java.lang.String.class, com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class, }, new String[]{}), 
  new Field("textureAtlas", net.brokenspork.systems.HudRenderSystem.class, com.badlogic.gdx.graphics.g2d.TextureAtlas.class, false, false, true, false, false, false, false, false, 356, 355, null, new String[]{}), 
  new Field("batch", net.brokenspork.systems.HudRenderSystem.class, com.badlogic.gdx.graphics.g2d.SpriteBatch.class, false, false, true, false, false, false, false, false, 358, 357, null, new String[]{}), 
  new Field("camera", net.brokenspork.systems.HudRenderSystem.class, com.badlogic.gdx.graphics.OrthographicCamera.class, false, false, true, false, false, false, false, false, 360, 359, null, new String[]{}), 
  new Field("font", net.brokenspork.systems.HudRenderSystem.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, true, false, false, false, false, false, 362, 361, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  net.brokenspork.systems.HudRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 363),
  new Method("begin", 
  net.brokenspork.systems.HudRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 364),
  new Method("processSystem", 
  net.brokenspork.systems.HudRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 365),
  new Method("end", 
  net.brokenspork.systems.HudRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 366),
  };
  t.constructors = new Constructor[] {
  new Constructor("HudRenderSystem", 
  net.brokenspork.systems.HudRenderSystem.class, 
  net.brokenspork.systems.HudRenderSystem.class, 
  new Parameter[] {
  new Parameter("camera", com.badlogic.gdx.graphics.OrthographicCamera.class, "Lcom/badlogic/gdx/graphics/OrthographicCamera;"), 
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 367),
  };
  types.put("net.brokenspork.systems.HudRenderSystem", t);
  
  }
  
  private void c39() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.MovementSystem";
  t.id = 368;
  t.clazz = net.brokenspork.systems.MovementSystem.class;
  t.superClass = com.artemis.systems.EntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.MovementSystem.class);
  tAssignables.add(com.artemis.systems.EntityProcessingSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("pm", net.brokenspork.systems.MovementSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 370, 369, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("vm", net.brokenspork.systems.MovementSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 372, 371, new Class[] {net.brokenspork.components.Velocity.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  };
  t.methods = new Method[] {
  new Method("process", 
  net.brokenspork.systems.MovementSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 373),
  };
  t.constructors = new Constructor[] {
  new Constructor("MovementSystem", 
  net.brokenspork.systems.MovementSystem.class, 
  net.brokenspork.systems.MovementSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 374),
  };
  types.put("net.brokenspork.systems.MovementSystem", t);
  
  }
  
  private void c40() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.ParallaxStarRepeatingSystem";
  t.id = 375;
  t.clazz = net.brokenspork.systems.ParallaxStarRepeatingSystem.class;
  t.superClass = com.artemis.systems.IntervalEntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.ParallaxStarRepeatingSystem.class);
  tAssignables.add(com.artemis.systems.IntervalEntityProcessingSystem.class);
  tAssignables.add(com.artemis.systems.IntervalEntitySystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("pm", net.brokenspork.systems.ParallaxStarRepeatingSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 377, 376, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  };
  t.methods = new Method[] {
  new Method("process", 
  net.brokenspork.systems.ParallaxStarRepeatingSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 378),
  };
  t.constructors = new Constructor[] {
  new Constructor("ParallaxStarRepeatingSystem", 
  net.brokenspork.systems.ParallaxStarRepeatingSystem.class, 
  net.brokenspork.systems.ParallaxStarRepeatingSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 379),
  };
  types.put("net.brokenspork.systems.ParallaxStarRepeatingSystem", t);
  
  }
  
  private void c41() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.PlayerInputSystem";
  t.id = 380;
  t.clazz = net.brokenspork.systems.PlayerInputSystem.class;
  t.superClass = com.artemis.systems.EntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.PlayerInputSystem.class);
  tAssignables.add(com.badlogic.gdx.InputProcessor.class);
  tAssignables.add(com.artemis.systems.EntityProcessingSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("HorizontalThrusters", net.brokenspork.systems.PlayerInputSystem.class, float.class, true, false, true, false, false, true, false, false, 382, 381, null, new String[]{}), 
  new Field("HorizontalMaxSpeed", net.brokenspork.systems.PlayerInputSystem.class, float.class, true, false, true, false, false, true, false, false, 384, 383, null, new String[]{}), 
  new Field("VerticalThrusters", net.brokenspork.systems.PlayerInputSystem.class, float.class, true, false, true, false, false, true, false, false, 386, 385, null, new String[]{}), 
  new Field("VerticalMaxSpeed", net.brokenspork.systems.PlayerInputSystem.class, float.class, true, false, true, false, false, true, false, false, 388, 387, null, new String[]{}), 
  new Field("FireRate", net.brokenspork.systems.PlayerInputSystem.class, float.class, true, false, true, false, false, true, false, false, 390, 389, null, new String[]{}), 
  new Field("pm", net.brokenspork.systems.PlayerInputSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 392, 391, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("vm", net.brokenspork.systems.PlayerInputSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 394, 393, new Class[] {net.brokenspork.components.Velocity.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("up", net.brokenspork.systems.PlayerInputSystem.class, boolean.class, false, false, true, false, false, false, false, false, 396, 395, null, new String[]{}), 
  new Field("down", net.brokenspork.systems.PlayerInputSystem.class, boolean.class, false, false, true, false, false, false, false, false, 398, 397, null, new String[]{}), 
  new Field("left", net.brokenspork.systems.PlayerInputSystem.class, boolean.class, false, false, true, false, false, false, false, false, 400, 399, null, new String[]{}), 
  new Field("right", net.brokenspork.systems.PlayerInputSystem.class, boolean.class, false, false, true, false, false, false, false, false, 402, 401, null, new String[]{}), 
  new Field("shoot", net.brokenspork.systems.PlayerInputSystem.class, boolean.class, false, false, true, false, false, false, false, false, 404, 403, null, new String[]{}), 
  new Field("timeToFire", net.brokenspork.systems.PlayerInputSystem.class, float.class, false, false, true, false, false, false, false, false, 406, 405, null, new String[]{}), 
  new Field("destinationX", net.brokenspork.systems.PlayerInputSystem.class, float.class, false, false, true, false, false, false, false, false, 408, 407, null, new String[]{}), 
  new Field("destinationY", net.brokenspork.systems.PlayerInputSystem.class, float.class, false, false, true, false, false, false, false, false, 410, 409, null, new String[]{}), 
  new Field("camera", net.brokenspork.systems.PlayerInputSystem.class, com.badlogic.gdx.graphics.OrthographicCamera.class, false, false, true, false, false, false, false, false, 412, 411, null, new String[]{}), 
  new Field("mouseVector", net.brokenspork.systems.PlayerInputSystem.class, com.badlogic.gdx.math.Vector3.class, false, false, true, false, false, false, false, false, 414, 413, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 415),
  new Method("process", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 416),
  new Method("keyDown", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("keycode", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 417),
  new Method("keyUp", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("keycode", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 418),
  new Method("keyTyped", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("character", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 419),
  new Method("touchDown", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  new Parameter("y", int.class, "I"), 
  new Parameter("pointer", int.class, "I"), 
  new Parameter("button", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 420),
  new Method("touchUp", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  new Parameter("y", int.class, "I"), 
  new Parameter("pointer", int.class, "I"), 
  new Parameter("button", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 421),
  new Method("touchDragged", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  new Parameter("y", int.class, "I"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 422),
  new Method("scrolled", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("amount", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 423),
  new Method("mouseMoved", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("screenX", int.class, "I"), 
  new Parameter("screenY", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, 424),
  };
  t.constructors = new Constructor[] {
  new Constructor("PlayerInputSystem", 
  net.brokenspork.systems.PlayerInputSystem.class, 
  net.brokenspork.systems.PlayerInputSystem.class, 
  new Parameter[] {
  new Parameter("camera", com.badlogic.gdx.graphics.OrthographicCamera.class, "Lcom/badlogic/gdx/graphics/OrthographicCamera;"), 
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 425),
  };
  types.put("net.brokenspork.systems.PlayerInputSystem", t);
  
  }
  
  private void c42() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.RemoveOffscreenShipsSystem";
  t.id = 426;
  t.clazz = net.brokenspork.systems.RemoveOffscreenShipsSystem.class;
  t.superClass = com.artemis.systems.IntervalEntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.RemoveOffscreenShipsSystem.class);
  tAssignables.add(com.artemis.systems.IntervalEntityProcessingSystem.class);
  tAssignables.add(com.artemis.systems.IntervalEntitySystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("pm", net.brokenspork.systems.RemoveOffscreenShipsSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 428, 427, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("bm", net.brokenspork.systems.RemoveOffscreenShipsSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 430, 429, new Class[] {net.brokenspork.components.Bounds.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  };
  t.methods = new Method[] {
  new Method("process", 
  net.brokenspork.systems.RemoveOffscreenShipsSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 431),
  };
  t.constructors = new Constructor[] {
  new Constructor("RemoveOffscreenShipsSystem", 
  net.brokenspork.systems.RemoveOffscreenShipsSystem.class, 
  net.brokenspork.systems.RemoveOffscreenShipsSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 432),
  };
  types.put("net.brokenspork.systems.RemoveOffscreenShipsSystem", t);
  
  }
  
  private void c43() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.ScaleAnimationSystem";
  t.id = 433;
  t.clazz = net.brokenspork.systems.ScaleAnimationSystem.class;
  t.superClass = com.artemis.systems.EntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.ScaleAnimationSystem.class);
  tAssignables.add(com.artemis.systems.EntityProcessingSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("sa", net.brokenspork.systems.ScaleAnimationSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 435, 434, new Class[] {net.brokenspork.components.ScaleAnimation.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("sm", net.brokenspork.systems.ScaleAnimationSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 437, 436, new Class[] {net.brokenspork.components.Sprite.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  };
  t.methods = new Method[] {
  new Method("process", 
  net.brokenspork.systems.ScaleAnimationSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 438),
  };
  t.constructors = new Constructor[] {
  new Constructor("ScaleAnimationSystem", 
  net.brokenspork.systems.ScaleAnimationSystem.class, 
  net.brokenspork.systems.ScaleAnimationSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 439),
  };
  types.put("net.brokenspork.systems.ScaleAnimationSystem", t);
  
  }
  
  private void c44() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.SoundEffectSystem";
  t.id = 440;
  t.clazz = net.brokenspork.systems.SoundEffectSystem.class;
  t.superClass = com.artemis.systems.EntityProcessingSystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.SoundEffectSystem.class);
  tAssignables.add(com.artemis.systems.EntityProcessingSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("se", net.brokenspork.systems.SoundEffectSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 442, 441, new Class[] {net.brokenspork.components.SoundEffect.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("pew", net.brokenspork.systems.SoundEffectSystem.class, com.badlogic.gdx.audio.Sound.class, false, true, false, false, false, false, false, false, 444, 443, null, new String[]{}), 
  new Field("asplode", net.brokenspork.systems.SoundEffectSystem.class, com.badlogic.gdx.audio.Sound.class, false, true, false, false, false, false, false, false, 446, 445, null, new String[]{}), 
  new Field("smallasplode", net.brokenspork.systems.SoundEffectSystem.class, com.badlogic.gdx.audio.Sound.class, false, true, false, false, false, false, false, false, 448, 447, null, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  net.brokenspork.systems.SoundEffectSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 449),
  new Method("process", 
  net.brokenspork.systems.SoundEffectSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 450),
  };
  t.constructors = new Constructor[] {
  new Constructor("SoundEffectSystem", 
  net.brokenspork.systems.SoundEffectSystem.class, 
  net.brokenspork.systems.SoundEffectSystem.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 451),
  };
  types.put("net.brokenspork.systems.SoundEffectSystem", t);
  
  }
  
  private void c45() {
  Type t = new Type();
  t.name = "net.brokenspork.systems.SpriteRenderSystem";
  t.id = 452;
  t.clazz = net.brokenspork.systems.SpriteRenderSystem.class;
  t.superClass = com.artemis.EntitySystem.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(net.brokenspork.systems.SpriteRenderSystem.class);
  tAssignables.add(com.artemis.EntitySystem.class);
  tAssignables.add(com.artemis.EntityObserver.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("pm", net.brokenspork.systems.SpriteRenderSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 454, 453, new Class[] {net.brokenspork.components.Position.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("sm", net.brokenspork.systems.SpriteRenderSystem.class, com.artemis.ComponentMapper.class, false, true, false, false, false, false, false, false, 456, 455, new Class[] {net.brokenspork.components.Sprite.class, }, new String[]{"com.artemis.annotations.Mapper"}), 
  new Field("regions", net.brokenspork.systems.SpriteRenderSystem.class, java.util.HashMap.class, false, false, true, false, false, false, false, false, 458, 457, new Class[] {java.lang.String.class, com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class, }, new String[]{}), 
  new Field("textureAtlas", net.brokenspork.systems.SpriteRenderSystem.class, com.badlogic.gdx.graphics.g2d.TextureAtlas.class, false, false, true, false, false, false, false, false, 460, 459, null, new String[]{}), 
  new Field("batch", net.brokenspork.systems.SpriteRenderSystem.class, com.badlogic.gdx.graphics.g2d.SpriteBatch.class, false, false, true, false, false, false, false, false, 462, 461, null, new String[]{}), 
  new Field("camera", net.brokenspork.systems.SpriteRenderSystem.class, com.badlogic.gdx.graphics.OrthographicCamera.class, false, false, true, false, false, false, false, false, 464, 463, null, new String[]{}), 
  new Field("font", net.brokenspork.systems.SpriteRenderSystem.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, true, false, false, false, false, false, 466, 465, null, new String[]{}), 
  new Field("regionsByEntity", net.brokenspork.systems.SpriteRenderSystem.class, com.artemis.utils.Bag.class, false, false, true, false, false, false, false, false, 468, 467, new Class[] {com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class, }, new String[]{}), 
  new Field("sortedEntities", net.brokenspork.systems.SpriteRenderSystem.class, java.util.List.class, false, false, true, false, false, false, false, false, 470, 469, new Class[] {com.artemis.Entity.class, }, new String[]{}), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 471),
  new Method("begin", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 472),
  new Method("checkProcessing", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 473),
  new Method("processEntities", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("entities", com.artemis.utils.ImmutableBag.class, "Lcom/artemis/utils/ImmutableBag;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 474),
  new Method("process", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 475),
  new Method("end", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 476),
  new Method("inserted", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 477),
  new Method("removed", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  void.class, 
  new Parameter[] {
  new Parameter("e", com.artemis.Entity.class, "Lcom/artemis/Entity;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, 478),
  };
  t.constructors = new Constructor[] {
  new Constructor("SpriteRenderSystem", 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  net.brokenspork.systems.SpriteRenderSystem.class, 
  new Parameter[] {
  new Parameter("camera", com.badlogic.gdx.graphics.OrthographicCamera.class, "Lcom/badlogic/gdx/graphics/OrthographicCamera;"), 
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  }, 
  false, false, false, false, false, false, true, false, false, false, true, 479),
  };
  types.put("net.brokenspork.systems.SpriteRenderSystem", t);
  
  }
  
  private void c46() {
  Type p = new Type();
  p.name = "void";
  p.id = 480;
  p.clazz = void.class;
  p.isPrimitive = true;
  types.put("void", p);
  
  }
  
  public IReflectionCacheGenerated() {
  c0();
  c1();
  c2();
  c3();
  c4();
  c5();
  c6();
  c7();
  c8();
  c9();
  c10();
  c11();
  c12();
  c13();
  c14();
  c15();
  c16();
  c17();
  c18();
  c19();
  c20();
  c21();
  c22();
  c23();
  c24();
  c25();
  c26();
  c27();
  c28();
  c29();
  c30();
  c31();
  c32();
  c33();
  c34();
  c35();
  c36();
  c37();
  c38();
  c39();
  c40();
  c41();
  c42();
  c43();
  c44();
  c45();
  c46();
  }
  
  
  
  
  // com.artemis.ComponentManager#componentsByType
  private native com.artemis.utils.Bag g5(com.artemis.ComponentManager obj) /*-{return obj.@com.artemis.ComponentManager::componentsByType;}-*/;
  
  // com.artemis.ComponentManager#packedComponents
  private native com.artemis.utils.Bag g7(com.artemis.ComponentManager obj) /*-{return obj.@com.artemis.ComponentManager::packedComponents;}-*/;
  
  // com.artemis.ComponentManager#packedComponentOwners
  private native com.artemis.utils.Bag g9(com.artemis.ComponentManager obj) /*-{return obj.@com.artemis.ComponentManager::packedComponentOwners;}-*/;
  
  // com.artemis.ComponentManager#entityContainerSize
  private native int g15(com.artemis.ComponentManager obj) /*-{return obj.@com.artemis.ComponentManager::entityContainerSize;}-*/;
  private native void s14(com.artemis.ComponentManager obj, int value)  /*-{obj.@com.artemis.ComponentManager::entityContainerSize = value;}-*/;
  
  // com.artemis.ComponentType#componentTypes
  private native java.util.IdentityHashMap g39(com.artemis.ComponentType obj) /*-{return @com.artemis.ComponentType::componentTypes;}-*/;
  
  // com.artemis.ComponentType#INDEX
  private native int g41(com.artemis.ComponentType obj) /*-{return @com.artemis.ComponentType::INDEX;}-*/;
  private native void s40(com.artemis.ComponentType obj, int value)  /*-{@com.artemis.ComponentType::INDEX = value}-*/;
  
  // com.artemis.ComponentType#index
  private native int g43(com.artemis.ComponentType obj) /*-{return obj.@com.artemis.ComponentType::index;}-*/;
  
  // com.artemis.ComponentType#type
  private native java.lang.Class g45(com.artemis.ComponentType obj) /*-{return obj.@com.artemis.ComponentType::type;}-*/;
  
  // com.artemis.ComponentType#types
  private native com.artemis.utils.Bag g49(com.artemis.ComponentType obj) /*-{return @com.artemis.ComponentType::types;}-*/;
  
  // com.artemis.EntityManager#entities
  private native com.artemis.utils.Bag g63(com.artemis.EntityManager obj) /*-{return obj.@com.artemis.EntityManager::entities;}-*/;
  
  // com.artemis.EntityManager#disabled
  private native java.util.BitSet g65(com.artemis.EntityManager obj) /*-{return obj.@com.artemis.EntityManager::disabled;}-*/;
  
  // com.artemis.EntityManager#active
  private native int g67(com.artemis.EntityManager obj) /*-{return obj.@com.artemis.EntityManager::active;}-*/;
  private native void s66(com.artemis.EntityManager obj, int value)  /*-{obj.@com.artemis.EntityManager::active = value;}-*/;
  
  
  
  
  // com.artemis.managers.GroupManager#EMPTY_BAG
  private native com.artemis.utils.ImmutableBag g99(com.artemis.managers.GroupManager obj) /*-{return @com.artemis.managers.GroupManager::EMPTY_BAG;}-*/;
  
  // com.artemis.managers.GroupManager#entitiesByGroup
  private native java.util.Map g101(com.artemis.managers.GroupManager obj) /*-{return obj.@com.artemis.managers.GroupManager::entitiesByGroup;}-*/;
  
  // com.artemis.managers.GroupManager#groupsByEntity
  private native java.util.Map g103(com.artemis.managers.GroupManager obj) /*-{return obj.@com.artemis.managers.GroupManager::groupsByEntity;}-*/;
  
  // com.artemis.managers.PlayerManager#playerByEntity
  private native java.util.Map g116(com.artemis.managers.PlayerManager obj) /*-{return obj.@com.artemis.managers.PlayerManager::playerByEntity;}-*/;
  
  // com.artemis.managers.PlayerManager#entitiesByPlayer
  private native java.util.Map g118(com.artemis.managers.PlayerManager obj) /*-{return obj.@com.artemis.managers.PlayerManager::entitiesByPlayer;}-*/;
  
  // com.artemis.managers.TagManager#entitiesByTag
  private native java.util.Map g128(com.artemis.managers.TagManager obj) /*-{return obj.@com.artemis.managers.TagManager::entitiesByTag;}-*/;
  
  // com.artemis.managers.TagManager#tagsByEntity
  private native java.util.Map g130(com.artemis.managers.TagManager obj) /*-{return obj.@com.artemis.managers.TagManager::tagsByEntity;}-*/;
  
  // com.artemis.managers.TeamManager#playersByTeam
  private native java.util.Map g141(com.artemis.managers.TeamManager obj) /*-{return obj.@com.artemis.managers.TeamManager::playersByTeam;}-*/;
  
  // com.artemis.managers.TeamManager#teamByPlayer
  private native java.util.Map g143(com.artemis.managers.TeamManager obj) /*-{return obj.@com.artemis.managers.TeamManager::teamByPlayer;}-*/;
  
  // net.brokenspork.components.Bounds#radius
  private native float g155(net.brokenspork.components.Bounds obj) /*-{return obj.@net.brokenspork.components.Bounds::radius;}-*/;
  private native void s154(net.brokenspork.components.Bounds obj, float value)  /*-{obj.@net.brokenspork.components.Bounds::radius = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#redMin
  private native float g159(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::redMin;}-*/;
  private native void s158(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::redMin = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#redMax
  private native float g161(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::redMax;}-*/;
  private native void s160(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::redMax = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#redSpeed
  private native float g163(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::redSpeed;}-*/;
  private native void s162(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::redSpeed = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#greenMin
  private native float g165(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::greenMin;}-*/;
  private native void s164(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::greenMin = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#greenMax
  private native float g167(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::greenMax;}-*/;
  private native void s166(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::greenMax = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#greenSpeed
  private native float g169(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::greenSpeed;}-*/;
  private native void s168(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::greenSpeed = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#blueMin
  private native float g171(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::blueMin;}-*/;
  private native void s170(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::blueMin = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#blueMax
  private native float g173(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::blueMax;}-*/;
  private native void s172(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::blueMax = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#blueSpeed
  private native float g175(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::blueSpeed;}-*/;
  private native void s174(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::blueSpeed = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#alphaMin
  private native float g177(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::alphaMin;}-*/;
  private native void s176(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::alphaMin = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#alphaMax
  private native float g179(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::alphaMax;}-*/;
  private native void s178(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::alphaMax = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#alphaSpeed
  private native float g181(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::alphaSpeed;}-*/;
  private native void s180(net.brokenspork.components.ColorAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ColorAnimation::alphaSpeed = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#redAnimate
  private native boolean g183(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::redAnimate;}-*/;
  private native void s182(net.brokenspork.components.ColorAnimation obj, boolean value)  /*-{obj.@net.brokenspork.components.ColorAnimation::redAnimate = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#greenAnimate
  private native boolean g185(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::greenAnimate;}-*/;
  private native void s184(net.brokenspork.components.ColorAnimation obj, boolean value)  /*-{obj.@net.brokenspork.components.ColorAnimation::greenAnimate = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#blueAnimate
  private native boolean g187(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::blueAnimate;}-*/;
  private native void s186(net.brokenspork.components.ColorAnimation obj, boolean value)  /*-{obj.@net.brokenspork.components.ColorAnimation::blueAnimate = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#alphaAnimate
  private native boolean g189(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::alphaAnimate;}-*/;
  private native void s188(net.brokenspork.components.ColorAnimation obj, boolean value)  /*-{obj.@net.brokenspork.components.ColorAnimation::alphaAnimate = value;}-*/;
  
  // net.brokenspork.components.ColorAnimation#repeat
  private native boolean g191(net.brokenspork.components.ColorAnimation obj) /*-{return obj.@net.brokenspork.components.ColorAnimation::repeat;}-*/;
  private native void s190(net.brokenspork.components.ColorAnimation obj, boolean value)  /*-{obj.@net.brokenspork.components.ColorAnimation::repeat = value;}-*/;
  
  // net.brokenspork.components.Expires#delay
  private native float g197(net.brokenspork.components.Expires obj) /*-{return obj.@net.brokenspork.components.Expires::delay;}-*/;
  private native void s196(net.brokenspork.components.Expires obj, float value)  /*-{obj.@net.brokenspork.components.Expires::delay = value;}-*/;
  
  // net.brokenspork.components.Health#health
  private native float g201(net.brokenspork.components.Health obj) /*-{return obj.@net.brokenspork.components.Health::health;}-*/;
  private native void s200(net.brokenspork.components.Health obj, float value)  /*-{obj.@net.brokenspork.components.Health::health = value;}-*/;
  
  // net.brokenspork.components.Health#maximumHealth
  private native float g203(net.brokenspork.components.Health obj) /*-{return obj.@net.brokenspork.components.Health::maximumHealth;}-*/;
  private native void s202(net.brokenspork.components.Health obj, float value)  /*-{obj.@net.brokenspork.components.Health::maximumHealth = value;}-*/;
  
  // net.brokenspork.components.Position#x
  private native float g211(net.brokenspork.components.Position obj) /*-{return obj.@net.brokenspork.components.Position::x;}-*/;
  private native void s210(net.brokenspork.components.Position obj, float value)  /*-{obj.@net.brokenspork.components.Position::x = value;}-*/;
  
  // net.brokenspork.components.Position#y
  private native float g213(net.brokenspork.components.Position obj) /*-{return obj.@net.brokenspork.components.Position::y;}-*/;
  private native void s212(net.brokenspork.components.Position obj, float value)  /*-{obj.@net.brokenspork.components.Position::y = value;}-*/;
  
  // net.brokenspork.components.ScaleAnimation#min
  private native float g217(net.brokenspork.components.ScaleAnimation obj) /*-{return obj.@net.brokenspork.components.ScaleAnimation::min;}-*/;
  private native void s216(net.brokenspork.components.ScaleAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ScaleAnimation::min = value;}-*/;
  
  // net.brokenspork.components.ScaleAnimation#max
  private native float g219(net.brokenspork.components.ScaleAnimation obj) /*-{return obj.@net.brokenspork.components.ScaleAnimation::max;}-*/;
  private native void s218(net.brokenspork.components.ScaleAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ScaleAnimation::max = value;}-*/;
  
  // net.brokenspork.components.ScaleAnimation#speed
  private native float g221(net.brokenspork.components.ScaleAnimation obj) /*-{return obj.@net.brokenspork.components.ScaleAnimation::speed;}-*/;
  private native void s220(net.brokenspork.components.ScaleAnimation obj, float value)  /*-{obj.@net.brokenspork.components.ScaleAnimation::speed = value;}-*/;
  
  // net.brokenspork.components.ScaleAnimation#repeat
  private native boolean g223(net.brokenspork.components.ScaleAnimation obj) /*-{return obj.@net.brokenspork.components.ScaleAnimation::repeat;}-*/;
  private native void s222(net.brokenspork.components.ScaleAnimation obj, boolean value)  /*-{obj.@net.brokenspork.components.ScaleAnimation::repeat = value;}-*/;
  
  // net.brokenspork.components.ScaleAnimation#active
  private native boolean g225(net.brokenspork.components.ScaleAnimation obj) /*-{return obj.@net.brokenspork.components.ScaleAnimation::active;}-*/;
  private native void s224(net.brokenspork.components.ScaleAnimation obj, boolean value)  /*-{obj.@net.brokenspork.components.ScaleAnimation::active = value;}-*/;
  
  // net.brokenspork.components.SoundEffect#effect
  private native net.brokenspork.components.SoundEffect.EFFECT g229(net.brokenspork.components.SoundEffect obj) /*-{return obj.@net.brokenspork.components.SoundEffect::effect;}-*/;
  private native void s228(net.brokenspork.components.SoundEffect obj, net.brokenspork.components.SoundEffect.EFFECT value)  /*-{obj.@net.brokenspork.components.SoundEffect::effect = value;}-*/;
  
  // net.brokenspork.components.SoundEffect.EFFECT#PEW
  private native net.brokenspork.components.SoundEffect.EFFECT g233(net.brokenspork.components.SoundEffect.EFFECT obj) /*-{return @net.brokenspork.components.SoundEffect.EFFECT::PEW;}-*/;
  
  // net.brokenspork.components.SoundEffect.EFFECT#ASPLODE
  private native net.brokenspork.components.SoundEffect.EFFECT g235(net.brokenspork.components.SoundEffect.EFFECT obj) /*-{return @net.brokenspork.components.SoundEffect.EFFECT::ASPLODE;}-*/;
  
  // net.brokenspork.components.SoundEffect.EFFECT#SMALLASPLODE
  private native net.brokenspork.components.SoundEffect.EFFECT g237(net.brokenspork.components.SoundEffect.EFFECT obj) /*-{return @net.brokenspork.components.SoundEffect.EFFECT::SMALLASPLODE;}-*/;
  
  // net.brokenspork.components.Sprite#name
  private native java.lang.String g248(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::name;}-*/;
  private native void s247(net.brokenspork.components.Sprite obj, java.lang.String value)  /*-{obj.@net.brokenspork.components.Sprite::name = value;}-*/;
  
  // net.brokenspork.components.Sprite#scaleX
  private native float g250(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::scaleX;}-*/;
  private native void s249(net.brokenspork.components.Sprite obj, float value)  /*-{obj.@net.brokenspork.components.Sprite::scaleX = value;}-*/;
  
  // net.brokenspork.components.Sprite#scaleY
  private native float g252(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::scaleY;}-*/;
  private native void s251(net.brokenspork.components.Sprite obj, float value)  /*-{obj.@net.brokenspork.components.Sprite::scaleY = value;}-*/;
  
  // net.brokenspork.components.Sprite#rotation
  private native float g254(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::rotation;}-*/;
  private native void s253(net.brokenspork.components.Sprite obj, float value)  /*-{obj.@net.brokenspork.components.Sprite::rotation = value;}-*/;
  
  // net.brokenspork.components.Sprite#r
  private native float g256(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::r;}-*/;
  private native void s255(net.brokenspork.components.Sprite obj, float value)  /*-{obj.@net.brokenspork.components.Sprite::r = value;}-*/;
  
  // net.brokenspork.components.Sprite#g
  private native float g258(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::g;}-*/;
  private native void s257(net.brokenspork.components.Sprite obj, float value)  /*-{obj.@net.brokenspork.components.Sprite::g = value;}-*/;
  
  // net.brokenspork.components.Sprite#b
  private native float g260(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::b;}-*/;
  private native void s259(net.brokenspork.components.Sprite obj, float value)  /*-{obj.@net.brokenspork.components.Sprite::b = value;}-*/;
  
  // net.brokenspork.components.Sprite#a
  private native float g262(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::a;}-*/;
  private native void s261(net.brokenspork.components.Sprite obj, float value)  /*-{obj.@net.brokenspork.components.Sprite::a = value;}-*/;
  
  // net.brokenspork.components.Sprite#layer
  private native net.brokenspork.components.Sprite.Layer g264(net.brokenspork.components.Sprite obj) /*-{return obj.@net.brokenspork.components.Sprite::layer;}-*/;
  private native void s263(net.brokenspork.components.Sprite obj, net.brokenspork.components.Sprite.Layer value)  /*-{obj.@net.brokenspork.components.Sprite::layer = value;}-*/;
  
  // net.brokenspork.components.Sprite.Layer#DEFAULT
  private native net.brokenspork.components.Sprite.Layer g268(net.brokenspork.components.Sprite.Layer obj) /*-{return @net.brokenspork.components.Sprite.Layer::DEFAULT;}-*/;
  
  // net.brokenspork.components.Sprite.Layer#BACKGROUND
  private native net.brokenspork.components.Sprite.Layer g270(net.brokenspork.components.Sprite.Layer obj) /*-{return @net.brokenspork.components.Sprite.Layer::BACKGROUND;}-*/;
  
  // net.brokenspork.components.Sprite.Layer#ACTORS_1
  private native net.brokenspork.components.Sprite.Layer g272(net.brokenspork.components.Sprite.Layer obj) /*-{return @net.brokenspork.components.Sprite.Layer::ACTORS_1;}-*/;
  
  // net.brokenspork.components.Sprite.Layer#ACTORS_2
  private native net.brokenspork.components.Sprite.Layer g274(net.brokenspork.components.Sprite.Layer obj) /*-{return @net.brokenspork.components.Sprite.Layer::ACTORS_2;}-*/;
  
  // net.brokenspork.components.Sprite.Layer#ACTORS_3
  private native net.brokenspork.components.Sprite.Layer g276(net.brokenspork.components.Sprite.Layer obj) /*-{return @net.brokenspork.components.Sprite.Layer::ACTORS_3;}-*/;
  
  // net.brokenspork.components.Sprite.Layer#PARTICLES
  private native net.brokenspork.components.Sprite.Layer g278(net.brokenspork.components.Sprite.Layer obj) /*-{return @net.brokenspork.components.Sprite.Layer::PARTICLES;}-*/;
  
  // net.brokenspork.components.Velocity#vectorX
  private native float g290(net.brokenspork.components.Velocity obj) /*-{return obj.@net.brokenspork.components.Velocity::vectorX;}-*/;
  private native void s289(net.brokenspork.components.Velocity obj, float value)  /*-{obj.@net.brokenspork.components.Velocity::vectorX = value;}-*/;
  
  // net.brokenspork.components.Velocity#vectorY
  private native float g292(net.brokenspork.components.Velocity obj) /*-{return obj.@net.brokenspork.components.Velocity::vectorY;}-*/;
  private native void s291(net.brokenspork.components.Velocity obj, float value)  /*-{obj.@net.brokenspork.components.Velocity::vectorY = value;}-*/;
  
  // net.brokenspork.systems.CollisionSystem#pm
  private native com.artemis.ComponentMapper g296(net.brokenspork.systems.CollisionSystem obj) /*-{return obj.@net.brokenspork.systems.CollisionSystem::pm;}-*/;
  private native void s295(net.brokenspork.systems.CollisionSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.CollisionSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.CollisionSystem#bm
  private native com.artemis.ComponentMapper g298(net.brokenspork.systems.CollisionSystem obj) /*-{return obj.@net.brokenspork.systems.CollisionSystem::bm;}-*/;
  private native void s297(net.brokenspork.systems.CollisionSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.CollisionSystem::bm = value;}-*/;
  
  // net.brokenspork.systems.CollisionSystem#hm
  private native com.artemis.ComponentMapper g300(net.brokenspork.systems.CollisionSystem obj) /*-{return obj.@net.brokenspork.systems.CollisionSystem::hm;}-*/;
  private native void s299(net.brokenspork.systems.CollisionSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.CollisionSystem::hm = value;}-*/;
  
  // net.brokenspork.systems.CollisionSystem#ex
  private native com.artemis.ComponentMapper g302(net.brokenspork.systems.CollisionSystem obj) /*-{return obj.@net.brokenspork.systems.CollisionSystem::ex;}-*/;
  private native void s301(net.brokenspork.systems.CollisionSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.CollisionSystem::ex = value;}-*/;
  
  // net.brokenspork.systems.CollisionSystem#collisionPairs
  private native com.artemis.utils.Bag g304(net.brokenspork.systems.CollisionSystem obj) /*-{return obj.@net.brokenspork.systems.CollisionSystem::collisionPairs;}-*/;
  private native void s303(net.brokenspork.systems.CollisionSystem obj, com.artemis.utils.Bag value)  /*-{obj.@net.brokenspork.systems.CollisionSystem::collisionPairs = value;}-*/;
  
  // net.brokenspork.systems.ColorAnimationSystem#cam
  private native com.artemis.ComponentMapper g311(net.brokenspork.systems.ColorAnimationSystem obj) /*-{return obj.@net.brokenspork.systems.ColorAnimationSystem::cam;}-*/;
  private native void s310(net.brokenspork.systems.ColorAnimationSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.ColorAnimationSystem::cam = value;}-*/;
  
  // net.brokenspork.systems.ColorAnimationSystem#sm
  private native com.artemis.ComponentMapper g313(net.brokenspork.systems.ColorAnimationSystem obj) /*-{return obj.@net.brokenspork.systems.ColorAnimationSystem::sm;}-*/;
  private native void s312(net.brokenspork.systems.ColorAnimationSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.ColorAnimationSystem::sm = value;}-*/;
  
  // net.brokenspork.systems.EntitySpawningTimerSystem#timer1
  private native com.artemis.utils.Timer g318(net.brokenspork.systems.EntitySpawningTimerSystem obj) /*-{return obj.@net.brokenspork.systems.EntitySpawningTimerSystem::timer1;}-*/;
  private native void s317(net.brokenspork.systems.EntitySpawningTimerSystem obj, com.artemis.utils.Timer value)  /*-{obj.@net.brokenspork.systems.EntitySpawningTimerSystem::timer1 = value;}-*/;
  
  // net.brokenspork.systems.EntitySpawningTimerSystem#timer2
  private native com.artemis.utils.Timer g320(net.brokenspork.systems.EntitySpawningTimerSystem obj) /*-{return obj.@net.brokenspork.systems.EntitySpawningTimerSystem::timer2;}-*/;
  private native void s319(net.brokenspork.systems.EntitySpawningTimerSystem obj, com.artemis.utils.Timer value)  /*-{obj.@net.brokenspork.systems.EntitySpawningTimerSystem::timer2 = value;}-*/;
  
  // net.brokenspork.systems.EntitySpawningTimerSystem#timer3
  private native com.artemis.utils.Timer g322(net.brokenspork.systems.EntitySpawningTimerSystem obj) /*-{return obj.@net.brokenspork.systems.EntitySpawningTimerSystem::timer3;}-*/;
  private native void s321(net.brokenspork.systems.EntitySpawningTimerSystem obj, com.artemis.utils.Timer value)  /*-{obj.@net.brokenspork.systems.EntitySpawningTimerSystem::timer3 = value;}-*/;
  
  // net.brokenspork.systems.ExpiringSystem#em
  private native com.artemis.ComponentMapper g327(net.brokenspork.systems.ExpiringSystem obj) /*-{return obj.@net.brokenspork.systems.ExpiringSystem::em;}-*/;
  private native void s326(net.brokenspork.systems.ExpiringSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.ExpiringSystem::em = value;}-*/;
  
  // net.brokenspork.systems.HealthRenderSystem#pm
  private native com.artemis.ComponentMapper g334(net.brokenspork.systems.HealthRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HealthRenderSystem::pm;}-*/;
  private native void s333(net.brokenspork.systems.HealthRenderSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.HealthRenderSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.HealthRenderSystem#hm
  private native com.artemis.ComponentMapper g336(net.brokenspork.systems.HealthRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HealthRenderSystem::hm;}-*/;
  private native void s335(net.brokenspork.systems.HealthRenderSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.HealthRenderSystem::hm = value;}-*/;
  
  // net.brokenspork.systems.HealthRenderSystem#batch
  private native com.badlogic.gdx.graphics.g2d.SpriteBatch g338(net.brokenspork.systems.HealthRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HealthRenderSystem::batch;}-*/;
  private native void s337(net.brokenspork.systems.HealthRenderSystem obj, com.badlogic.gdx.graphics.g2d.SpriteBatch value)  /*-{obj.@net.brokenspork.systems.HealthRenderSystem::batch = value;}-*/;
  
  // net.brokenspork.systems.HealthRenderSystem#camera
  private native com.badlogic.gdx.graphics.OrthographicCamera g340(net.brokenspork.systems.HealthRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HealthRenderSystem::camera;}-*/;
  private native void s339(net.brokenspork.systems.HealthRenderSystem obj, com.badlogic.gdx.graphics.OrthographicCamera value)  /*-{obj.@net.brokenspork.systems.HealthRenderSystem::camera = value;}-*/;
  
  // net.brokenspork.systems.HealthRenderSystem#font
  private native com.badlogic.gdx.graphics.g2d.BitmapFont g342(net.brokenspork.systems.HealthRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HealthRenderSystem::font;}-*/;
  private native void s341(net.brokenspork.systems.HealthRenderSystem obj, com.badlogic.gdx.graphics.g2d.BitmapFont value)  /*-{obj.@net.brokenspork.systems.HealthRenderSystem::font = value;}-*/;
  
  // net.brokenspork.systems.HudRenderSystem#pm
  private native com.artemis.ComponentMapper g350(net.brokenspork.systems.HudRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HudRenderSystem::pm;}-*/;
  private native void s349(net.brokenspork.systems.HudRenderSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.HudRenderSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.HudRenderSystem#sm
  private native com.artemis.ComponentMapper g352(net.brokenspork.systems.HudRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HudRenderSystem::sm;}-*/;
  private native void s351(net.brokenspork.systems.HudRenderSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.HudRenderSystem::sm = value;}-*/;
  
  // net.brokenspork.systems.HudRenderSystem#regions
  private native java.util.HashMap g354(net.brokenspork.systems.HudRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HudRenderSystem::regions;}-*/;
  private native void s353(net.brokenspork.systems.HudRenderSystem obj, java.util.HashMap value)  /*-{obj.@net.brokenspork.systems.HudRenderSystem::regions = value;}-*/;
  
  // net.brokenspork.systems.HudRenderSystem#textureAtlas
  private native com.badlogic.gdx.graphics.g2d.TextureAtlas g356(net.brokenspork.systems.HudRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HudRenderSystem::textureAtlas;}-*/;
  private native void s355(net.brokenspork.systems.HudRenderSystem obj, com.badlogic.gdx.graphics.g2d.TextureAtlas value)  /*-{obj.@net.brokenspork.systems.HudRenderSystem::textureAtlas = value;}-*/;
  
  // net.brokenspork.systems.HudRenderSystem#batch
  private native com.badlogic.gdx.graphics.g2d.SpriteBatch g358(net.brokenspork.systems.HudRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HudRenderSystem::batch;}-*/;
  private native void s357(net.brokenspork.systems.HudRenderSystem obj, com.badlogic.gdx.graphics.g2d.SpriteBatch value)  /*-{obj.@net.brokenspork.systems.HudRenderSystem::batch = value;}-*/;
  
  // net.brokenspork.systems.HudRenderSystem#camera
  private native com.badlogic.gdx.graphics.OrthographicCamera g360(net.brokenspork.systems.HudRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HudRenderSystem::camera;}-*/;
  private native void s359(net.brokenspork.systems.HudRenderSystem obj, com.badlogic.gdx.graphics.OrthographicCamera value)  /*-{obj.@net.brokenspork.systems.HudRenderSystem::camera = value;}-*/;
  
  // net.brokenspork.systems.HudRenderSystem#font
  private native com.badlogic.gdx.graphics.g2d.BitmapFont g362(net.brokenspork.systems.HudRenderSystem obj) /*-{return obj.@net.brokenspork.systems.HudRenderSystem::font;}-*/;
  private native void s361(net.brokenspork.systems.HudRenderSystem obj, com.badlogic.gdx.graphics.g2d.BitmapFont value)  /*-{obj.@net.brokenspork.systems.HudRenderSystem::font = value;}-*/;
  
  // net.brokenspork.systems.MovementSystem#pm
  private native com.artemis.ComponentMapper g370(net.brokenspork.systems.MovementSystem obj) /*-{return obj.@net.brokenspork.systems.MovementSystem::pm;}-*/;
  private native void s369(net.brokenspork.systems.MovementSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.MovementSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.MovementSystem#vm
  private native com.artemis.ComponentMapper g372(net.brokenspork.systems.MovementSystem obj) /*-{return obj.@net.brokenspork.systems.MovementSystem::vm;}-*/;
  private native void s371(net.brokenspork.systems.MovementSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.MovementSystem::vm = value;}-*/;
  
  // net.brokenspork.systems.ParallaxStarRepeatingSystem#pm
  private native com.artemis.ComponentMapper g377(net.brokenspork.systems.ParallaxStarRepeatingSystem obj) /*-{return obj.@net.brokenspork.systems.ParallaxStarRepeatingSystem::pm;}-*/;
  private native void s376(net.brokenspork.systems.ParallaxStarRepeatingSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.ParallaxStarRepeatingSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#HorizontalThrusters
  private native float g382(net.brokenspork.systems.PlayerInputSystem obj) /*-{return @net.brokenspork.systems.PlayerInputSystem::HorizontalThrusters;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#HorizontalMaxSpeed
  private native float g384(net.brokenspork.systems.PlayerInputSystem obj) /*-{return @net.brokenspork.systems.PlayerInputSystem::HorizontalMaxSpeed;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#VerticalThrusters
  private native float g386(net.brokenspork.systems.PlayerInputSystem obj) /*-{return @net.brokenspork.systems.PlayerInputSystem::VerticalThrusters;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#VerticalMaxSpeed
  private native float g388(net.brokenspork.systems.PlayerInputSystem obj) /*-{return @net.brokenspork.systems.PlayerInputSystem::VerticalMaxSpeed;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#FireRate
  private native float g390(net.brokenspork.systems.PlayerInputSystem obj) /*-{return @net.brokenspork.systems.PlayerInputSystem::FireRate;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#pm
  private native com.artemis.ComponentMapper g392(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::pm;}-*/;
  private native void s391(net.brokenspork.systems.PlayerInputSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#vm
  private native com.artemis.ComponentMapper g394(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::vm;}-*/;
  private native void s393(net.brokenspork.systems.PlayerInputSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::vm = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#up
  private native boolean g396(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::up;}-*/;
  private native void s395(net.brokenspork.systems.PlayerInputSystem obj, boolean value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::up = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#down
  private native boolean g398(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::down;}-*/;
  private native void s397(net.brokenspork.systems.PlayerInputSystem obj, boolean value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::down = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#left
  private native boolean g400(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::left;}-*/;
  private native void s399(net.brokenspork.systems.PlayerInputSystem obj, boolean value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::left = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#right
  private native boolean g402(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::right;}-*/;
  private native void s401(net.brokenspork.systems.PlayerInputSystem obj, boolean value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::right = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#shoot
  private native boolean g404(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::shoot;}-*/;
  private native void s403(net.brokenspork.systems.PlayerInputSystem obj, boolean value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::shoot = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#timeToFire
  private native float g406(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::timeToFire;}-*/;
  private native void s405(net.brokenspork.systems.PlayerInputSystem obj, float value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::timeToFire = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#destinationX
  private native float g408(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::destinationX;}-*/;
  private native void s407(net.brokenspork.systems.PlayerInputSystem obj, float value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::destinationX = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#destinationY
  private native float g410(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::destinationY;}-*/;
  private native void s409(net.brokenspork.systems.PlayerInputSystem obj, float value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::destinationY = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#camera
  private native com.badlogic.gdx.graphics.OrthographicCamera g412(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::camera;}-*/;
  private native void s411(net.brokenspork.systems.PlayerInputSystem obj, com.badlogic.gdx.graphics.OrthographicCamera value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::camera = value;}-*/;
  
  // net.brokenspork.systems.PlayerInputSystem#mouseVector
  private native com.badlogic.gdx.math.Vector3 g414(net.brokenspork.systems.PlayerInputSystem obj) /*-{return obj.@net.brokenspork.systems.PlayerInputSystem::mouseVector;}-*/;
  private native void s413(net.brokenspork.systems.PlayerInputSystem obj, com.badlogic.gdx.math.Vector3 value)  /*-{obj.@net.brokenspork.systems.PlayerInputSystem::mouseVector = value;}-*/;
  
  // net.brokenspork.systems.RemoveOffscreenShipsSystem#pm
  private native com.artemis.ComponentMapper g428(net.brokenspork.systems.RemoveOffscreenShipsSystem obj) /*-{return obj.@net.brokenspork.systems.RemoveOffscreenShipsSystem::pm;}-*/;
  private native void s427(net.brokenspork.systems.RemoveOffscreenShipsSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.RemoveOffscreenShipsSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.RemoveOffscreenShipsSystem#bm
  private native com.artemis.ComponentMapper g430(net.brokenspork.systems.RemoveOffscreenShipsSystem obj) /*-{return obj.@net.brokenspork.systems.RemoveOffscreenShipsSystem::bm;}-*/;
  private native void s429(net.brokenspork.systems.RemoveOffscreenShipsSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.RemoveOffscreenShipsSystem::bm = value;}-*/;
  
  // net.brokenspork.systems.ScaleAnimationSystem#sa
  private native com.artemis.ComponentMapper g435(net.brokenspork.systems.ScaleAnimationSystem obj) /*-{return obj.@net.brokenspork.systems.ScaleAnimationSystem::sa;}-*/;
  private native void s434(net.brokenspork.systems.ScaleAnimationSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.ScaleAnimationSystem::sa = value;}-*/;
  
  // net.brokenspork.systems.ScaleAnimationSystem#sm
  private native com.artemis.ComponentMapper g437(net.brokenspork.systems.ScaleAnimationSystem obj) /*-{return obj.@net.brokenspork.systems.ScaleAnimationSystem::sm;}-*/;
  private native void s436(net.brokenspork.systems.ScaleAnimationSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.ScaleAnimationSystem::sm = value;}-*/;
  
  // net.brokenspork.systems.SoundEffectSystem#se
  private native com.artemis.ComponentMapper g442(net.brokenspork.systems.SoundEffectSystem obj) /*-{return obj.@net.brokenspork.systems.SoundEffectSystem::se;}-*/;
  private native void s441(net.brokenspork.systems.SoundEffectSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.SoundEffectSystem::se = value;}-*/;
  
  // net.brokenspork.systems.SoundEffectSystem#pew
  private native com.badlogic.gdx.audio.Sound g444(net.brokenspork.systems.SoundEffectSystem obj) /*-{return obj.@net.brokenspork.systems.SoundEffectSystem::pew;}-*/;
  private native void s443(net.brokenspork.systems.SoundEffectSystem obj, com.badlogic.gdx.audio.Sound value)  /*-{obj.@net.brokenspork.systems.SoundEffectSystem::pew = value;}-*/;
  
  // net.brokenspork.systems.SoundEffectSystem#asplode
  private native com.badlogic.gdx.audio.Sound g446(net.brokenspork.systems.SoundEffectSystem obj) /*-{return obj.@net.brokenspork.systems.SoundEffectSystem::asplode;}-*/;
  private native void s445(net.brokenspork.systems.SoundEffectSystem obj, com.badlogic.gdx.audio.Sound value)  /*-{obj.@net.brokenspork.systems.SoundEffectSystem::asplode = value;}-*/;
  
  // net.brokenspork.systems.SoundEffectSystem#smallasplode
  private native com.badlogic.gdx.audio.Sound g448(net.brokenspork.systems.SoundEffectSystem obj) /*-{return obj.@net.brokenspork.systems.SoundEffectSystem::smallasplode;}-*/;
  private native void s447(net.brokenspork.systems.SoundEffectSystem obj, com.badlogic.gdx.audio.Sound value)  /*-{obj.@net.brokenspork.systems.SoundEffectSystem::smallasplode = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#pm
  private native com.artemis.ComponentMapper g454(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::pm;}-*/;
  private native void s453(net.brokenspork.systems.SpriteRenderSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::pm = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#sm
  private native com.artemis.ComponentMapper g456(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::sm;}-*/;
  private native void s455(net.brokenspork.systems.SpriteRenderSystem obj, com.artemis.ComponentMapper value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::sm = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#regions
  private native java.util.HashMap g458(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::regions;}-*/;
  private native void s457(net.brokenspork.systems.SpriteRenderSystem obj, java.util.HashMap value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::regions = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#textureAtlas
  private native com.badlogic.gdx.graphics.g2d.TextureAtlas g460(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::textureAtlas;}-*/;
  private native void s459(net.brokenspork.systems.SpriteRenderSystem obj, com.badlogic.gdx.graphics.g2d.TextureAtlas value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::textureAtlas = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#batch
  private native com.badlogic.gdx.graphics.g2d.SpriteBatch g462(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::batch;}-*/;
  private native void s461(net.brokenspork.systems.SpriteRenderSystem obj, com.badlogic.gdx.graphics.g2d.SpriteBatch value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::batch = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#camera
  private native com.badlogic.gdx.graphics.OrthographicCamera g464(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::camera;}-*/;
  private native void s463(net.brokenspork.systems.SpriteRenderSystem obj, com.badlogic.gdx.graphics.OrthographicCamera value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::camera = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#font
  private native com.badlogic.gdx.graphics.g2d.BitmapFont g466(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::font;}-*/;
  private native void s465(net.brokenspork.systems.SpriteRenderSystem obj, com.badlogic.gdx.graphics.g2d.BitmapFont value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::font = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#regionsByEntity
  private native com.artemis.utils.Bag g468(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::regionsByEntity;}-*/;
  private native void s467(net.brokenspork.systems.SpriteRenderSystem obj, com.artemis.utils.Bag value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::regionsByEntity = value;}-*/;
  
  // net.brokenspork.systems.SpriteRenderSystem#sortedEntities
  private native java.util.List g470(net.brokenspork.systems.SpriteRenderSystem obj) /*-{return obj.@net.brokenspork.systems.SpriteRenderSystem::sortedEntities;}-*/;
  private native void s469(net.brokenspork.systems.SpriteRenderSystem obj, java.util.List value)  /*-{obj.@net.brokenspork.systems.SpriteRenderSystem::sortedEntities = value;}-*/;
  
  private native com.artemis.Component m16(com.artemis.ComponentManager obj, com.artemis.Entity p0,java.lang.Class p1) /*-{
  return obj.@com.artemis.ComponentManager::create(Lcom/artemis/Entity;Ljava/lang/Class;)(p0, p1);
  }-*/;
  
  private native java.util.BitSet m17(com.artemis.ComponentManager obj, com.artemis.ComponentType p0) /*-{
  return obj.@com.artemis.ComponentManager::getPackedComponentOwners(Lcom/artemis/ComponentType;)(p0);
  }-*/;
  
  private native com.artemis.Component m18(java.lang.Class p0) /*-{
  return @com.artemis.ComponentManager::newInstance(Ljava/lang/Class;)(p0);
  }-*/;
  
  private native Object m19(com.artemis.ComponentManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.ComponentManager::removeComponentsOfEntity(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m20(com.artemis.ComponentManager obj, com.artemis.Entity p0,com.artemis.ComponentType p1,com.artemis.Component p2) /*-{
  obj.@com.artemis.ComponentManager::addComponent(Lcom/artemis/Entity;Lcom/artemis/ComponentType;Lcom/artemis/Component;)(p0, p1, p2);
  return null;
  }-*/;
  
  private native Object m21(com.artemis.ComponentManager obj, com.artemis.ComponentType p0,com.artemis.PackedComponent p1) /*-{
  obj.@com.artemis.ComponentManager::addPackedComponent(Lcom/artemis/ComponentType;Lcom/artemis/PackedComponent;)(p0, p1);
  return null;
  }-*/;
  
  private native Object m22(com.artemis.ComponentManager obj, com.artemis.Entity p0,com.artemis.ComponentType p1,com.artemis.Component p2) /*-{
  obj.@com.artemis.ComponentManager::addBasicComponent(Lcom/artemis/Entity;Lcom/artemis/ComponentType;Lcom/artemis/Component;)(p0, p1, p2);
  return null;
  }-*/;
  
  private native Object m23(com.artemis.ComponentManager obj, com.artemis.Entity p0,com.artemis.ComponentType p1) /*-{
  obj.@com.artemis.ComponentManager::removeComponent(Lcom/artemis/Entity;Lcom/artemis/ComponentType;)(p0, p1);
  return null;
  }-*/;
  
  private native com.artemis.utils.Bag m24(com.artemis.ComponentManager obj, com.artemis.ComponentType p0) /*-{
  return obj.@com.artemis.ComponentManager::getComponentsByType(Lcom/artemis/ComponentType;)(p0);
  }-*/;
  
  private native com.artemis.Component m25(com.artemis.ComponentManager obj, com.artemis.Entity p0,com.artemis.ComponentType p1) /*-{
  return obj.@com.artemis.ComponentManager::getComponent(Lcom/artemis/Entity;Lcom/artemis/ComponentType;)(p0, p1);
  }-*/;
  
  private native com.artemis.utils.Bag m26(com.artemis.ComponentManager obj, com.artemis.Entity p0,com.artemis.utils.Bag p1) /*-{
  return obj.@com.artemis.ComponentManager::getComponentsFor(Lcom/artemis/Entity;Lcom/artemis/utils/Bag;)(p0, p1);
  }-*/;
  
  private native Object m27(com.artemis.ComponentManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.ComponentManager::deleted(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m28(com.artemis.ComponentManager obj) /*-{
  obj.@com.artemis.ComponentManager::clean()();
  return null;
  }-*/;
  
  private static com.artemis.ComponentManager m29(int p0) {
  return new com.artemis.ComponentManager(p0);
  }
  
  private native com.artemis.Component m31(com.artemis.ComponentMapper obj, com.artemis.Entity p0) /*-{
  return obj.@com.artemis.ComponentMapper::get(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private native com.artemis.Component m32(com.artemis.ComponentMapper obj, com.artemis.Entity p0,boolean p1) /*-{
  return obj.@com.artemis.ComponentMapper::get(Lcom/artemis/Entity;Z)(p0, p1);
  }-*/;
  
  private native com.artemis.Component m33(com.artemis.ComponentMapper obj, com.artemis.Entity p0) /*-{
  return obj.@com.artemis.ComponentMapper::getSafe(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private native com.artemis.Component m34(com.artemis.ComponentMapper obj, com.artemis.Entity p0,boolean p1) /*-{
  return obj.@com.artemis.ComponentMapper::getSafe(Lcom/artemis/Entity;Z)(p0, p1);
  }-*/;
  
  private native boolean m35(com.artemis.ComponentMapper obj, com.artemis.Entity p0) /*-{
  return obj.@com.artemis.ComponentMapper::has(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private native com.artemis.ComponentMapper m36(java.lang.Class p0,com.artemis.World p1) /*-{
  return @com.artemis.ComponentMapper::getFor(Ljava/lang/Class;Lcom/artemis/World;)(p0, p1);
  }-*/;
  
  private native int m50(com.artemis.ComponentType obj) /*-{
  return obj.@com.artemis.ComponentType::getIndex()();
  }-*/;
  
  private native java.lang.String m51(com.artemis.ComponentType obj) /*-{
  return obj.@com.artemis.ComponentType::toString()();
  }-*/;
  
  
  
  private native boolean m54(com.artemis.ComponentType obj) /*-{
  return obj.@com.artemis.ComponentType::isPackedComponent()();
  }-*/;
  
  private native boolean m55(int p0) /*-{
  return @com.artemis.ComponentType::isPackedComponent(I)(p0);
  }-*/;
  
  private native java.lang.Class m56(com.artemis.ComponentType obj) /*-{
  return obj.@com.artemis.ComponentType::getType()();
  }-*/;
  
  private native com.artemis.ComponentType m57(java.lang.Class p0) /*-{
  return @com.artemis.ComponentType::getTypeFor(Ljava/lang/Class;)(p0);
  }-*/;
  
  private native com.artemis.ComponentType m58(int p0) /*-{
  return @com.artemis.ComponentType::getTypeFor(I)(p0);
  }-*/;
  
  private native int m59(java.lang.Class p0) /*-{
  return @com.artemis.ComponentType::getIndexFor(Ljava/lang/Class;)(p0);
  }-*/;
  
  private static com.artemis.ComponentType m60(java.lang.Class p0) {
  return new com.artemis.ComponentType(p0);
  }
  
  private native Object m76(com.artemis.EntityManager obj) /*-{
  obj.@com.artemis.EntityManager::initialize()();
  return null;
  }-*/;
  
  private native com.artemis.Entity m77(com.artemis.EntityManager obj) /*-{
  return obj.@com.artemis.EntityManager::createEntityInstance()();
  }-*/;
  
  private native Object m78(com.artemis.EntityManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.EntityManager::added(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m79(com.artemis.EntityManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.EntityManager::enabled(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m80(com.artemis.EntityManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.EntityManager::disabled(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m81(com.artemis.EntityManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.EntityManager::deleted(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native boolean m82(com.artemis.EntityManager obj, int p0) /*-{
  return obj.@com.artemis.EntityManager::isActive(I)(p0);
  }-*/;
  
  private native boolean m83(com.artemis.EntityManager obj, int p0) /*-{
  return obj.@com.artemis.EntityManager::isEnabled(I)(p0);
  }-*/;
  
  private native com.artemis.Entity m84(com.artemis.EntityManager obj, int p0) /*-{
  return obj.@com.artemis.EntityManager::getEntity(I)(p0);
  }-*/;
  
  private native int m85(com.artemis.EntityManager obj) /*-{
  return obj.@com.artemis.EntityManager::getActiveEntityCount()();
  }-*/;
  
  
  
  
  private native Object m89(com.artemis.EntityManager obj) /*-{
  obj.@com.artemis.EntityManager::clean()();
  return null;
  }-*/;
  
  private static com.artemis.EntityManager m90(int p0) {
  return new com.artemis.EntityManager(p0);
  }
  
  private native com.artemis.PackedComponent m92(com.artemis.PackedComponent obj, com.artemis.Entity p0) /*-{
  return obj.@com.artemis.PackedComponent::forEntity(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private native Object m93(com.artemis.PackedComponent obj) /*-{
  obj.@com.artemis.PackedComponent::reset()();
  return null;
  }-*/;
  
  private native Object m95(com.artemis.PooledComponent obj) /*-{
  obj.@com.artemis.PooledComponent::reset()();
  return null;
  }-*/;
  
  private native Object m104(com.artemis.managers.GroupManager obj) /*-{
  obj.@com.artemis.managers.GroupManager::initialize()();
  return null;
  }-*/;
  
  private native Object m105(com.artemis.managers.GroupManager obj, com.artemis.Entity p0,java.lang.String p1) /*-{
  obj.@com.artemis.managers.GroupManager::add(Lcom/artemis/Entity;Ljava/lang/String;)(p0, p1);
  return null;
  }-*/;
  
  private native Object m106(com.artemis.managers.GroupManager obj, com.artemis.Entity p0,java.lang.String p1) /*-{
  obj.@com.artemis.managers.GroupManager::remove(Lcom/artemis/Entity;Ljava/lang/String;)(p0, p1);
  return null;
  }-*/;
  
  private native Object m107(com.artemis.managers.GroupManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.managers.GroupManager::removeFromAllGroups(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native com.artemis.utils.ImmutableBag m108(com.artemis.managers.GroupManager obj, java.lang.String p0) /*-{
  return obj.@com.artemis.managers.GroupManager::getEntities(Ljava/lang/String;)(p0);
  }-*/;
  
  private native com.artemis.utils.ImmutableBag m109(com.artemis.managers.GroupManager obj, com.artemis.Entity p0) /*-{
  return obj.@com.artemis.managers.GroupManager::getGroups(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private native boolean m110(com.artemis.managers.GroupManager obj, com.artemis.Entity p0) /*-{
  return obj.@com.artemis.managers.GroupManager::isInAnyGroup(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private native boolean m111(com.artemis.managers.GroupManager obj, com.artemis.Entity p0,java.lang.String p1) /*-{
  return obj.@com.artemis.managers.GroupManager::isInGroup(Lcom/artemis/Entity;Ljava/lang/String;)(p0, p1);
  }-*/;
  
  private native Object m112(com.artemis.managers.GroupManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.managers.GroupManager::deleted(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static com.artemis.managers.GroupManager m113() {
  return new com.artemis.managers.GroupManager();
  }
  
  private native Object m119(com.artemis.managers.PlayerManager obj, com.artemis.Entity p0,java.lang.String p1) /*-{
  obj.@com.artemis.managers.PlayerManager::setPlayer(Lcom/artemis/Entity;Ljava/lang/String;)(p0, p1);
  return null;
  }-*/;
  
  private native com.artemis.utils.ImmutableBag m120(com.artemis.managers.PlayerManager obj, java.lang.String p0) /*-{
  return obj.@com.artemis.managers.PlayerManager::getEntitiesOfPlayer(Ljava/lang/String;)(p0);
  }-*/;
  
  private native Object m121(com.artemis.managers.PlayerManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.managers.PlayerManager::removeFromPlayer(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native java.lang.String m122(com.artemis.managers.PlayerManager obj, com.artemis.Entity p0) /*-{
  return obj.@com.artemis.managers.PlayerManager::getPlayer(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private native Object m123(com.artemis.managers.PlayerManager obj) /*-{
  obj.@com.artemis.managers.PlayerManager::initialize()();
  return null;
  }-*/;
  
  private native Object m124(com.artemis.managers.PlayerManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.managers.PlayerManager::deleted(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static com.artemis.managers.PlayerManager m125() {
  return new com.artemis.managers.PlayerManager();
  }
  
  private native Object m131(com.artemis.managers.TagManager obj, java.lang.String p0,com.artemis.Entity p1) /*-{
  obj.@com.artemis.managers.TagManager::register(Ljava/lang/String;Lcom/artemis/Entity;)(p0, p1);
  return null;
  }-*/;
  
  private native Object m132(com.artemis.managers.TagManager obj, java.lang.String p0) /*-{
  obj.@com.artemis.managers.TagManager::unregister(Ljava/lang/String;)(p0);
  return null;
  }-*/;
  
  private native boolean m133(com.artemis.managers.TagManager obj, java.lang.String p0) /*-{
  return obj.@com.artemis.managers.TagManager::isRegistered(Ljava/lang/String;)(p0);
  }-*/;
  
  private native com.artemis.Entity m134(com.artemis.managers.TagManager obj, java.lang.String p0) /*-{
  return obj.@com.artemis.managers.TagManager::getEntity(Ljava/lang/String;)(p0);
  }-*/;
  
  private native java.util.Collection m135(com.artemis.managers.TagManager obj) /*-{
  return obj.@com.artemis.managers.TagManager::getRegisteredTags()();
  }-*/;
  
  private native Object m136(com.artemis.managers.TagManager obj, com.artemis.Entity p0) /*-{
  obj.@com.artemis.managers.TagManager::deleted(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m137(com.artemis.managers.TagManager obj) /*-{
  obj.@com.artemis.managers.TagManager::initialize()();
  return null;
  }-*/;
  
  private static com.artemis.managers.TagManager m138() {
  return new com.artemis.managers.TagManager();
  }
  
  private native Object m144(com.artemis.managers.TeamManager obj) /*-{
  obj.@com.artemis.managers.TeamManager::initialize()();
  return null;
  }-*/;
  
  private native java.lang.String m145(com.artemis.managers.TeamManager obj, java.lang.String p0) /*-{
  return obj.@com.artemis.managers.TeamManager::getTeam(Ljava/lang/String;)(p0);
  }-*/;
  
  private native Object m146(com.artemis.managers.TeamManager obj, java.lang.String p0,java.lang.String p1) /*-{
  obj.@com.artemis.managers.TeamManager::setTeam(Ljava/lang/String;Ljava/lang/String;)(p0, p1);
  return null;
  }-*/;
  
  private native com.artemis.utils.ImmutableBag m147(com.artemis.managers.TeamManager obj, java.lang.String p0) /*-{
  return obj.@com.artemis.managers.TeamManager::getPlayers(Ljava/lang/String;)(p0);
  }-*/;
  
  private native Object m148(com.artemis.managers.TeamManager obj, java.lang.String p0) /*-{
  obj.@com.artemis.managers.TeamManager::removeFromTeam(Ljava/lang/String;)(p0);
  return null;
  }-*/;
  
  private static com.artemis.managers.TeamManager m149() {
  return new com.artemis.managers.TeamManager();
  }
  
  private static net.brokenspork.components.Bounds m156() {
  return new net.brokenspork.components.Bounds();
  }
  
  private static net.brokenspork.components.ColorAnimation m192() {
  return new net.brokenspork.components.ColorAnimation();
  }
  
  private static net.brokenspork.components.Enemy m194() {
  return new net.brokenspork.components.Enemy();
  }
  
  private static net.brokenspork.components.Expires m198() {
  return new net.brokenspork.components.Expires();
  }
  
  private static net.brokenspork.components.Health m204() {
  return new net.brokenspork.components.Health();
  }
  
  private static net.brokenspork.components.ParallaxStar m206() {
  return new net.brokenspork.components.ParallaxStar();
  }
  
  private static net.brokenspork.components.Player m208() {
  return new net.brokenspork.components.Player();
  }
  
  private static net.brokenspork.components.Position m214() {
  return new net.brokenspork.components.Position();
  }
  
  private static net.brokenspork.components.ScaleAnimation m226() {
  return new net.brokenspork.components.ScaleAnimation();
  }
  
  private static net.brokenspork.components.SoundEffect m230() {
  return new net.brokenspork.components.SoundEffect();
  }
  
  private native net.brokenspork.components.SoundEffect.EFFECT[] m238() /*-{
  return @net.brokenspork.components.SoundEffect.EFFECT::values()();
  }-*/;
  
  private native net.brokenspork.components.SoundEffect.EFFECT m239(java.lang.String p0) /*-{
  return @net.brokenspork.components.SoundEffect.EFFECT::valueOf(Ljava/lang/String;)(p0);
  }-*/;
  
  
  
  
  
  
  private static net.brokenspork.components.Sprite m265() {
  return new net.brokenspork.components.Sprite();
  }
  
  private native int m279(net.brokenspork.components.Sprite.Layer obj) /*-{
  return obj.@net.brokenspork.components.Sprite.Layer::getLayerId()();
  }-*/;
  
  private native net.brokenspork.components.Sprite.Layer[] m280() /*-{
  return @net.brokenspork.components.Sprite.Layer::values()();
  }-*/;
  
  private native net.brokenspork.components.Sprite.Layer m281(java.lang.String p0) /*-{
  return @net.brokenspork.components.Sprite.Layer::valueOf(Ljava/lang/String;)(p0);
  }-*/;
  
  
  
  
  
  
  private static net.brokenspork.components.Velocity m293() {
  return new net.brokenspork.components.Velocity();
  }
  
  private native Object m305(net.brokenspork.systems.CollisionSystem obj) /*-{
  obj.@net.brokenspork.systems.CollisionSystem::initialize()();
  return null;
  }-*/;
  
  private native Object m306(net.brokenspork.systems.CollisionSystem obj, com.artemis.utils.ImmutableBag p0) /*-{
  obj.@net.brokenspork.systems.CollisionSystem::processEntities(Lcom/artemis/utils/ImmutableBag;)(p0);
  return null;
  }-*/;
  
  private native boolean m307(net.brokenspork.systems.CollisionSystem obj) /*-{
  return obj.@net.brokenspork.systems.CollisionSystem::checkProcessing()();
  }-*/;
  
  private static net.brokenspork.systems.CollisionSystem m308() {
  return new net.brokenspork.systems.CollisionSystem();
  }
  
  private native Object m314(net.brokenspork.systems.ColorAnimationSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.ColorAnimationSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static net.brokenspork.systems.ColorAnimationSystem m315() {
  return new net.brokenspork.systems.ColorAnimationSystem();
  }
  
  private native Object m323(net.brokenspork.systems.EntitySpawningTimerSystem obj) /*-{
  obj.@net.brokenspork.systems.EntitySpawningTimerSystem::processSystem()();
  return null;
  }-*/;
  
  private static net.brokenspork.systems.EntitySpawningTimerSystem m324() {
  return new net.brokenspork.systems.EntitySpawningTimerSystem();
  }
  
  private native Object m328(net.brokenspork.systems.ExpiringSystem obj, com.artemis.Entity p0,float p1) /*-{
  obj.@net.brokenspork.systems.ExpiringSystem::processDelta(Lcom/artemis/Entity;F)(p0, p1);
  return null;
  }-*/;
  
  private native Object m329(net.brokenspork.systems.ExpiringSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.ExpiringSystem::processExpired(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native float m330(net.brokenspork.systems.ExpiringSystem obj, com.artemis.Entity p0) /*-{
  return obj.@net.brokenspork.systems.ExpiringSystem::getRemainingDelay(Lcom/artemis/Entity;)(p0);
  }-*/;
  
  private static net.brokenspork.systems.ExpiringSystem m331() {
  return new net.brokenspork.systems.ExpiringSystem();
  }
  
  private native Object m343(net.brokenspork.systems.HealthRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.HealthRenderSystem::initialize()();
  return null;
  }-*/;
  
  private native Object m344(net.brokenspork.systems.HealthRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.HealthRenderSystem::begin()();
  return null;
  }-*/;
  
  private native Object m345(net.brokenspork.systems.HealthRenderSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.HealthRenderSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m346(net.brokenspork.systems.HealthRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.HealthRenderSystem::end()();
  return null;
  }-*/;
  
  private static net.brokenspork.systems.HealthRenderSystem m347(com.badlogic.gdx.graphics.OrthographicCamera p0) {
  return new net.brokenspork.systems.HealthRenderSystem(p0);
  }
  
  private native Object m363(net.brokenspork.systems.HudRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.HudRenderSystem::initialize()();
  return null;
  }-*/;
  
  private native Object m364(net.brokenspork.systems.HudRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.HudRenderSystem::begin()();
  return null;
  }-*/;
  
  private native Object m365(net.brokenspork.systems.HudRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.HudRenderSystem::processSystem()();
  return null;
  }-*/;
  
  private native Object m366(net.brokenspork.systems.HudRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.HudRenderSystem::end()();
  return null;
  }-*/;
  
  private static net.brokenspork.systems.HudRenderSystem m367(com.badlogic.gdx.graphics.OrthographicCamera p0) {
  return new net.brokenspork.systems.HudRenderSystem(p0);
  }
  
  private native Object m373(net.brokenspork.systems.MovementSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.MovementSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static net.brokenspork.systems.MovementSystem m374() {
  return new net.brokenspork.systems.MovementSystem();
  }
  
  private native Object m378(net.brokenspork.systems.ParallaxStarRepeatingSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.ParallaxStarRepeatingSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static net.brokenspork.systems.ParallaxStarRepeatingSystem m379() {
  return new net.brokenspork.systems.ParallaxStarRepeatingSystem();
  }
  
  private native Object m415(net.brokenspork.systems.PlayerInputSystem obj) /*-{
  obj.@net.brokenspork.systems.PlayerInputSystem::initialize()();
  return null;
  }-*/;
  
  private native Object m416(net.brokenspork.systems.PlayerInputSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.PlayerInputSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native boolean m417(net.brokenspork.systems.PlayerInputSystem obj, int p0) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::keyDown(I)(p0);
  }-*/;
  
  private native boolean m418(net.brokenspork.systems.PlayerInputSystem obj, int p0) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::keyUp(I)(p0);
  }-*/;
  
  private native boolean m419(net.brokenspork.systems.PlayerInputSystem obj, char p0) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::keyTyped(C)(p0);
  }-*/;
  
  private native boolean m420(net.brokenspork.systems.PlayerInputSystem obj, int p0,int p1,int p2,int p3) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::touchDown(IIII)(p0, p1, p2, p3);
  }-*/;
  
  private native boolean m421(net.brokenspork.systems.PlayerInputSystem obj, int p0,int p1,int p2,int p3) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::touchUp(IIII)(p0, p1, p2, p3);
  }-*/;
  
  private native boolean m422(net.brokenspork.systems.PlayerInputSystem obj, int p0,int p1,int p2) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::touchDragged(III)(p0, p1, p2);
  }-*/;
  
  private native boolean m423(net.brokenspork.systems.PlayerInputSystem obj, int p0) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::scrolled(I)(p0);
  }-*/;
  
  private native boolean m424(net.brokenspork.systems.PlayerInputSystem obj, int p0,int p1) /*-{
  return obj.@net.brokenspork.systems.PlayerInputSystem::mouseMoved(II)(p0, p1);
  }-*/;
  
  private static net.brokenspork.systems.PlayerInputSystem m425(com.badlogic.gdx.graphics.OrthographicCamera p0) {
  return new net.brokenspork.systems.PlayerInputSystem(p0);
  }
  
  private native Object m431(net.brokenspork.systems.RemoveOffscreenShipsSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.RemoveOffscreenShipsSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static net.brokenspork.systems.RemoveOffscreenShipsSystem m432() {
  return new net.brokenspork.systems.RemoveOffscreenShipsSystem();
  }
  
  private native Object m438(net.brokenspork.systems.ScaleAnimationSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.ScaleAnimationSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static net.brokenspork.systems.ScaleAnimationSystem m439() {
  return new net.brokenspork.systems.ScaleAnimationSystem();
  }
  
  private native Object m449(net.brokenspork.systems.SoundEffectSystem obj) /*-{
  obj.@net.brokenspork.systems.SoundEffectSystem::initialize()();
  return null;
  }-*/;
  
  private native Object m450(net.brokenspork.systems.SoundEffectSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.SoundEffectSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static net.brokenspork.systems.SoundEffectSystem m451() {
  return new net.brokenspork.systems.SoundEffectSystem();
  }
  
  private native Object m471(net.brokenspork.systems.SpriteRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.SpriteRenderSystem::initialize()();
  return null;
  }-*/;
  
  private native Object m472(net.brokenspork.systems.SpriteRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.SpriteRenderSystem::begin()();
  return null;
  }-*/;
  
  private native boolean m473(net.brokenspork.systems.SpriteRenderSystem obj) /*-{
  return obj.@net.brokenspork.systems.SpriteRenderSystem::checkProcessing()();
  }-*/;
  
  private native Object m474(net.brokenspork.systems.SpriteRenderSystem obj, com.artemis.utils.ImmutableBag p0) /*-{
  obj.@net.brokenspork.systems.SpriteRenderSystem::processEntities(Lcom/artemis/utils/ImmutableBag;)(p0);
  return null;
  }-*/;
  
  private native Object m475(net.brokenspork.systems.SpriteRenderSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.SpriteRenderSystem::process(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m476(net.brokenspork.systems.SpriteRenderSystem obj) /*-{
  obj.@net.brokenspork.systems.SpriteRenderSystem::end()();
  return null;
  }-*/;
  
  private native Object m477(net.brokenspork.systems.SpriteRenderSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.SpriteRenderSystem::inserted(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private native Object m478(net.brokenspork.systems.SpriteRenderSystem obj, com.artemis.Entity p0) /*-{
  obj.@net.brokenspork.systems.SpriteRenderSystem::removed(Lcom/artemis/Entity;)(p0);
  return null;
  }-*/;
  
  private static net.brokenspork.systems.SpriteRenderSystem m479(com.badlogic.gdx.graphics.OrthographicCamera p0,com.badlogic.gdx.graphics.g2d.SpriteBatch p1) {
  return new net.brokenspork.systems.SpriteRenderSystem(p0, p1);
  }
  
  public Collection<Type> getKnownTypes() {
  	return types.values();
  }
  public Type forName(String name) {
  	return types.get(name);
  }
  public Object newArray (Class componentType, int size) {
      Type t = forName(componentType.getName().replace('$', '.'));
      if (t != null) {
      switch(t.id) {
      case 0: return new boolean[size];
      case 1: return new char[size];
      case 2: return new com.artemis.Component[size];
      case 3: return new com.artemis.ComponentManager[size];
      case 30: return new com.artemis.ComponentMapper[size];
      case 37: return new com.artemis.ComponentType[size];
      case 61: return new com.artemis.EntityManager[size];
      case 91: return new com.artemis.PackedComponent[size];
      case 94: return new com.artemis.PooledComponent[size];
      case 96: return new com.artemis.annotations.Mapper[size];
      case 97: return new com.artemis.managers.GroupManager[size];
      case 114: return new com.artemis.managers.PlayerManager[size];
      case 126: return new com.artemis.managers.TagManager[size];
      case 139: return new com.artemis.managers.TeamManager[size];
      case 150: return new float[size];
      case 151: return new int[size];
      case 152: return new long[size];
      case 153: return new net.brokenspork.components.Bounds[size];
      case 157: return new net.brokenspork.components.ColorAnimation[size];
      case 193: return new net.brokenspork.components.Enemy[size];
      case 195: return new net.brokenspork.components.Expires[size];
      case 199: return new net.brokenspork.components.Health[size];
      case 205: return new net.brokenspork.components.ParallaxStar[size];
      case 207: return new net.brokenspork.components.Player[size];
      case 209: return new net.brokenspork.components.Position[size];
      case 215: return new net.brokenspork.components.ScaleAnimation[size];
      case 227: return new net.brokenspork.components.SoundEffect[size];
      case 231: return new net.brokenspork.components.SoundEffect.EFFECT[size];
      case 240: return new net.brokenspork.components.SoundEffect.EFFECT[size][];
      case 246: return new net.brokenspork.components.Sprite[size];
      case 266: return new net.brokenspork.components.Sprite.Layer[size];
      case 282: return new net.brokenspork.components.Sprite.Layer[size][];
      case 288: return new net.brokenspork.components.Velocity[size];
      case 294: return new net.brokenspork.systems.CollisionSystem[size];
      case 309: return new net.brokenspork.systems.ColorAnimationSystem[size];
      case 316: return new net.brokenspork.systems.EntitySpawningTimerSystem[size];
      case 325: return new net.brokenspork.systems.ExpiringSystem[size];
      case 332: return new net.brokenspork.systems.HealthRenderSystem[size];
      case 348: return new net.brokenspork.systems.HudRenderSystem[size];
      case 368: return new net.brokenspork.systems.MovementSystem[size];
      case 375: return new net.brokenspork.systems.ParallaxStarRepeatingSystem[size];
      case 380: return new net.brokenspork.systems.PlayerInputSystem[size];
      case 426: return new net.brokenspork.systems.RemoveOffscreenShipsSystem[size];
      case 433: return new net.brokenspork.systems.ScaleAnimationSystem[size];
      case 440: return new net.brokenspork.systems.SoundEffectSystem[size];
      case 452: return new net.brokenspork.systems.SpriteRenderSystem[size];
  }
      }
      throw new RuntimeException("Couldn't create array with element type " + componentType.getName());
  }
  public int getArrayLength(Type type, Object obj) {
  	return ((Object[])obj).length;
  }
  public Object getArrayElement(Type type, Object obj, int i) {
  	return ((Object[])obj)[i];
  }
  public void setArrayElement(Type type, Object obj, int i, Object value) {
  	((Object[])obj)[i] = value;
  }
  public Object get(Field field, Object obj) throws IllegalAccessException {
      switch(field.getter) {
      case 5: return g5(((com.artemis.ComponentManager)obj));
      case 7: return g7(((com.artemis.ComponentManager)obj));
      case 9: return g9(((com.artemis.ComponentManager)obj));
      case 15: return g15(((com.artemis.ComponentManager)obj));
      case 39: return g39(((com.artemis.ComponentType)obj));
      case 41: return g41(((com.artemis.ComponentType)obj));
      case 43: return g43(((com.artemis.ComponentType)obj));
      case 45: return g45(((com.artemis.ComponentType)obj));
      case 49: return g49(((com.artemis.ComponentType)obj));
      case 63: return g63(((com.artemis.EntityManager)obj));
      case 65: return g65(((com.artemis.EntityManager)obj));
      case 67: return g67(((com.artemis.EntityManager)obj));
      case 99: return g99(((com.artemis.managers.GroupManager)obj));
      case 101: return g101(((com.artemis.managers.GroupManager)obj));
      case 103: return g103(((com.artemis.managers.GroupManager)obj));
      case 116: return g116(((com.artemis.managers.PlayerManager)obj));
      case 118: return g118(((com.artemis.managers.PlayerManager)obj));
      case 128: return g128(((com.artemis.managers.TagManager)obj));
      case 130: return g130(((com.artemis.managers.TagManager)obj));
      case 141: return g141(((com.artemis.managers.TeamManager)obj));
      case 143: return g143(((com.artemis.managers.TeamManager)obj));
      case 155: return g155(((net.brokenspork.components.Bounds)obj));
      case 159: return g159(((net.brokenspork.components.ColorAnimation)obj));
      case 161: return g161(((net.brokenspork.components.ColorAnimation)obj));
      case 163: return g163(((net.brokenspork.components.ColorAnimation)obj));
      case 165: return g165(((net.brokenspork.components.ColorAnimation)obj));
      case 167: return g167(((net.brokenspork.components.ColorAnimation)obj));
      case 169: return g169(((net.brokenspork.components.ColorAnimation)obj));
      case 171: return g171(((net.brokenspork.components.ColorAnimation)obj));
      case 173: return g173(((net.brokenspork.components.ColorAnimation)obj));
      case 175: return g175(((net.brokenspork.components.ColorAnimation)obj));
      case 177: return g177(((net.brokenspork.components.ColorAnimation)obj));
      case 179: return g179(((net.brokenspork.components.ColorAnimation)obj));
      case 181: return g181(((net.brokenspork.components.ColorAnimation)obj));
      case 183: return g183(((net.brokenspork.components.ColorAnimation)obj));
      case 185: return g185(((net.brokenspork.components.ColorAnimation)obj));
      case 187: return g187(((net.brokenspork.components.ColorAnimation)obj));
      case 189: return g189(((net.brokenspork.components.ColorAnimation)obj));
      case 191: return g191(((net.brokenspork.components.ColorAnimation)obj));
      case 197: return g197(((net.brokenspork.components.Expires)obj));
      case 201: return g201(((net.brokenspork.components.Health)obj));
      case 203: return g203(((net.brokenspork.components.Health)obj));
      case 211: return g211(((net.brokenspork.components.Position)obj));
      case 213: return g213(((net.brokenspork.components.Position)obj));
      case 217: return g217(((net.brokenspork.components.ScaleAnimation)obj));
      case 219: return g219(((net.brokenspork.components.ScaleAnimation)obj));
      case 221: return g221(((net.brokenspork.components.ScaleAnimation)obj));
      case 223: return g223(((net.brokenspork.components.ScaleAnimation)obj));
      case 225: return g225(((net.brokenspork.components.ScaleAnimation)obj));
      case 229: return g229(((net.brokenspork.components.SoundEffect)obj));
      case 233: return g233(((net.brokenspork.components.SoundEffect.EFFECT)obj));
      case 235: return g235(((net.brokenspork.components.SoundEffect.EFFECT)obj));
      case 237: return g237(((net.brokenspork.components.SoundEffect.EFFECT)obj));
      case 248: return g248(((net.brokenspork.components.Sprite)obj));
      case 250: return g250(((net.brokenspork.components.Sprite)obj));
      case 252: return g252(((net.brokenspork.components.Sprite)obj));
      case 254: return g254(((net.brokenspork.components.Sprite)obj));
      case 256: return g256(((net.brokenspork.components.Sprite)obj));
      case 258: return g258(((net.brokenspork.components.Sprite)obj));
      case 260: return g260(((net.brokenspork.components.Sprite)obj));
      case 262: return g262(((net.brokenspork.components.Sprite)obj));
      case 264: return g264(((net.brokenspork.components.Sprite)obj));
      case 268: return g268(((net.brokenspork.components.Sprite.Layer)obj));
      case 270: return g270(((net.brokenspork.components.Sprite.Layer)obj));
      case 272: return g272(((net.brokenspork.components.Sprite.Layer)obj));
      case 274: return g274(((net.brokenspork.components.Sprite.Layer)obj));
      case 276: return g276(((net.brokenspork.components.Sprite.Layer)obj));
      case 278: return g278(((net.brokenspork.components.Sprite.Layer)obj));
      case 290: return g290(((net.brokenspork.components.Velocity)obj));
      case 292: return g292(((net.brokenspork.components.Velocity)obj));
      case 296: return g296(((net.brokenspork.systems.CollisionSystem)obj));
      case 298: return g298(((net.brokenspork.systems.CollisionSystem)obj));
      case 300: return g300(((net.brokenspork.systems.CollisionSystem)obj));
      case 302: return g302(((net.brokenspork.systems.CollisionSystem)obj));
      case 304: return g304(((net.brokenspork.systems.CollisionSystem)obj));
      case 311: return g311(((net.brokenspork.systems.ColorAnimationSystem)obj));
      case 313: return g313(((net.brokenspork.systems.ColorAnimationSystem)obj));
      case 318: return g318(((net.brokenspork.systems.EntitySpawningTimerSystem)obj));
      case 320: return g320(((net.brokenspork.systems.EntitySpawningTimerSystem)obj));
      case 322: return g322(((net.brokenspork.systems.EntitySpawningTimerSystem)obj));
      case 327: return g327(((net.brokenspork.systems.ExpiringSystem)obj));
      case 334: return g334(((net.brokenspork.systems.HealthRenderSystem)obj));
      case 336: return g336(((net.brokenspork.systems.HealthRenderSystem)obj));
      case 338: return g338(((net.brokenspork.systems.HealthRenderSystem)obj));
      case 340: return g340(((net.brokenspork.systems.HealthRenderSystem)obj));
      case 342: return g342(((net.brokenspork.systems.HealthRenderSystem)obj));
      case 350: return g350(((net.brokenspork.systems.HudRenderSystem)obj));
      case 352: return g352(((net.brokenspork.systems.HudRenderSystem)obj));
      case 354: return g354(((net.brokenspork.systems.HudRenderSystem)obj));
      case 356: return g356(((net.brokenspork.systems.HudRenderSystem)obj));
      case 358: return g358(((net.brokenspork.systems.HudRenderSystem)obj));
      case 360: return g360(((net.brokenspork.systems.HudRenderSystem)obj));
      case 362: return g362(((net.brokenspork.systems.HudRenderSystem)obj));
      case 370: return g370(((net.brokenspork.systems.MovementSystem)obj));
      case 372: return g372(((net.brokenspork.systems.MovementSystem)obj));
      case 377: return g377(((net.brokenspork.systems.ParallaxStarRepeatingSystem)obj));
      case 382: return g382(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 384: return g384(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 386: return g386(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 388: return g388(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 390: return g390(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 392: return g392(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 394: return g394(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 396: return g396(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 398: return g398(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 400: return g400(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 402: return g402(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 404: return g404(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 406: return g406(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 408: return g408(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 410: return g410(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 412: return g412(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 414: return g414(((net.brokenspork.systems.PlayerInputSystem)obj));
      case 428: return g428(((net.brokenspork.systems.RemoveOffscreenShipsSystem)obj));
      case 430: return g430(((net.brokenspork.systems.RemoveOffscreenShipsSystem)obj));
      case 435: return g435(((net.brokenspork.systems.ScaleAnimationSystem)obj));
      case 437: return g437(((net.brokenspork.systems.ScaleAnimationSystem)obj));
      case 442: return g442(((net.brokenspork.systems.SoundEffectSystem)obj));
      case 444: return g444(((net.brokenspork.systems.SoundEffectSystem)obj));
      case 446: return g446(((net.brokenspork.systems.SoundEffectSystem)obj));
      case 448: return g448(((net.brokenspork.systems.SoundEffectSystem)obj));
      case 454: return g454(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 456: return g456(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 458: return g458(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 460: return g460(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 462: return g462(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 464: return g464(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 466: return g466(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 468: return g468(((net.brokenspork.systems.SpriteRenderSystem)obj));
      case 470: return g470(((net.brokenspork.systems.SpriteRenderSystem)obj));
  }
     throw new IllegalArgumentException("Missing getter-stub " + field.getter + " for field " + field.name);
  }
  public void set(Field field, Object obj, Object value) throws IllegalAccessException {
      switch(field.setter) {
      case 14: s14(((com.artemis.ComponentManager)obj), ((Number)value).intValue()); return;
      case 40: s40(((com.artemis.ComponentType)obj), ((Number)value).intValue()); return;
      case 66: s66(((com.artemis.EntityManager)obj), ((Number)value).intValue()); return;
      case 154: s154(((net.brokenspork.components.Bounds)obj), ((Number)value).floatValue()); return;
      case 158: s158(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 160: s160(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 162: s162(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 164: s164(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 166: s166(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 168: s168(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 170: s170(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 172: s172(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 174: s174(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 176: s176(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 178: s178(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 180: s180(((net.brokenspork.components.ColorAnimation)obj), ((Number)value).floatValue()); return;
      case 182: s182(((net.brokenspork.components.ColorAnimation)obj), ((Boolean)value).booleanValue()); return;
      case 184: s184(((net.brokenspork.components.ColorAnimation)obj), ((Boolean)value).booleanValue()); return;
      case 186: s186(((net.brokenspork.components.ColorAnimation)obj), ((Boolean)value).booleanValue()); return;
      case 188: s188(((net.brokenspork.components.ColorAnimation)obj), ((Boolean)value).booleanValue()); return;
      case 190: s190(((net.brokenspork.components.ColorAnimation)obj), ((Boolean)value).booleanValue()); return;
      case 196: s196(((net.brokenspork.components.Expires)obj), ((Number)value).floatValue()); return;
      case 200: s200(((net.brokenspork.components.Health)obj), ((Number)value).floatValue()); return;
      case 202: s202(((net.brokenspork.components.Health)obj), ((Number)value).floatValue()); return;
      case 210: s210(((net.brokenspork.components.Position)obj), ((Number)value).floatValue()); return;
      case 212: s212(((net.brokenspork.components.Position)obj), ((Number)value).floatValue()); return;
      case 216: s216(((net.brokenspork.components.ScaleAnimation)obj), ((Number)value).floatValue()); return;
      case 218: s218(((net.brokenspork.components.ScaleAnimation)obj), ((Number)value).floatValue()); return;
      case 220: s220(((net.brokenspork.components.ScaleAnimation)obj), ((Number)value).floatValue()); return;
      case 222: s222(((net.brokenspork.components.ScaleAnimation)obj), ((Boolean)value).booleanValue()); return;
      case 224: s224(((net.brokenspork.components.ScaleAnimation)obj), ((Boolean)value).booleanValue()); return;
      case 228: s228(((net.brokenspork.components.SoundEffect)obj), ((net.brokenspork.components.SoundEffect.EFFECT)value)); return;
      case 247: s247(((net.brokenspork.components.Sprite)obj), ((java.lang.String)value)); return;
      case 249: s249(((net.brokenspork.components.Sprite)obj), ((Number)value).floatValue()); return;
      case 251: s251(((net.brokenspork.components.Sprite)obj), ((Number)value).floatValue()); return;
      case 253: s253(((net.brokenspork.components.Sprite)obj), ((Number)value).floatValue()); return;
      case 255: s255(((net.brokenspork.components.Sprite)obj), ((Number)value).floatValue()); return;
      case 257: s257(((net.brokenspork.components.Sprite)obj), ((Number)value).floatValue()); return;
      case 259: s259(((net.brokenspork.components.Sprite)obj), ((Number)value).floatValue()); return;
      case 261: s261(((net.brokenspork.components.Sprite)obj), ((Number)value).floatValue()); return;
      case 263: s263(((net.brokenspork.components.Sprite)obj), ((net.brokenspork.components.Sprite.Layer)value)); return;
      case 289: s289(((net.brokenspork.components.Velocity)obj), ((Number)value).floatValue()); return;
      case 291: s291(((net.brokenspork.components.Velocity)obj), ((Number)value).floatValue()); return;
      case 295: s295(((net.brokenspork.systems.CollisionSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 297: s297(((net.brokenspork.systems.CollisionSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 299: s299(((net.brokenspork.systems.CollisionSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 301: s301(((net.brokenspork.systems.CollisionSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 303: s303(((net.brokenspork.systems.CollisionSystem)obj), ((com.artemis.utils.Bag)value)); return;
      case 310: s310(((net.brokenspork.systems.ColorAnimationSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 312: s312(((net.brokenspork.systems.ColorAnimationSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 317: s317(((net.brokenspork.systems.EntitySpawningTimerSystem)obj), ((com.artemis.utils.Timer)value)); return;
      case 319: s319(((net.brokenspork.systems.EntitySpawningTimerSystem)obj), ((com.artemis.utils.Timer)value)); return;
      case 321: s321(((net.brokenspork.systems.EntitySpawningTimerSystem)obj), ((com.artemis.utils.Timer)value)); return;
      case 326: s326(((net.brokenspork.systems.ExpiringSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 333: s333(((net.brokenspork.systems.HealthRenderSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 335: s335(((net.brokenspork.systems.HealthRenderSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 337: s337(((net.brokenspork.systems.HealthRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.SpriteBatch)value)); return;
      case 339: s339(((net.brokenspork.systems.HealthRenderSystem)obj), ((com.badlogic.gdx.graphics.OrthographicCamera)value)); return;
      case 341: s341(((net.brokenspork.systems.HealthRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.BitmapFont)value)); return;
      case 349: s349(((net.brokenspork.systems.HudRenderSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 351: s351(((net.brokenspork.systems.HudRenderSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 353: s353(((net.brokenspork.systems.HudRenderSystem)obj), ((java.util.HashMap)value)); return;
      case 355: s355(((net.brokenspork.systems.HudRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.TextureAtlas)value)); return;
      case 357: s357(((net.brokenspork.systems.HudRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.SpriteBatch)value)); return;
      case 359: s359(((net.brokenspork.systems.HudRenderSystem)obj), ((com.badlogic.gdx.graphics.OrthographicCamera)value)); return;
      case 361: s361(((net.brokenspork.systems.HudRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.BitmapFont)value)); return;
      case 369: s369(((net.brokenspork.systems.MovementSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 371: s371(((net.brokenspork.systems.MovementSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 376: s376(((net.brokenspork.systems.ParallaxStarRepeatingSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 391: s391(((net.brokenspork.systems.PlayerInputSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 393: s393(((net.brokenspork.systems.PlayerInputSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 395: s395(((net.brokenspork.systems.PlayerInputSystem)obj), ((Boolean)value).booleanValue()); return;
      case 397: s397(((net.brokenspork.systems.PlayerInputSystem)obj), ((Boolean)value).booleanValue()); return;
      case 399: s399(((net.brokenspork.systems.PlayerInputSystem)obj), ((Boolean)value).booleanValue()); return;
      case 401: s401(((net.brokenspork.systems.PlayerInputSystem)obj), ((Boolean)value).booleanValue()); return;
      case 403: s403(((net.brokenspork.systems.PlayerInputSystem)obj), ((Boolean)value).booleanValue()); return;
      case 405: s405(((net.brokenspork.systems.PlayerInputSystem)obj), ((Number)value).floatValue()); return;
      case 407: s407(((net.brokenspork.systems.PlayerInputSystem)obj), ((Number)value).floatValue()); return;
      case 409: s409(((net.brokenspork.systems.PlayerInputSystem)obj), ((Number)value).floatValue()); return;
      case 411: s411(((net.brokenspork.systems.PlayerInputSystem)obj), ((com.badlogic.gdx.graphics.OrthographicCamera)value)); return;
      case 413: s413(((net.brokenspork.systems.PlayerInputSystem)obj), ((com.badlogic.gdx.math.Vector3)value)); return;
      case 427: s427(((net.brokenspork.systems.RemoveOffscreenShipsSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 429: s429(((net.brokenspork.systems.RemoveOffscreenShipsSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 434: s434(((net.brokenspork.systems.ScaleAnimationSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 436: s436(((net.brokenspork.systems.ScaleAnimationSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 441: s441(((net.brokenspork.systems.SoundEffectSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 443: s443(((net.brokenspork.systems.SoundEffectSystem)obj), ((com.badlogic.gdx.audio.Sound)value)); return;
      case 445: s445(((net.brokenspork.systems.SoundEffectSystem)obj), ((com.badlogic.gdx.audio.Sound)value)); return;
      case 447: s447(((net.brokenspork.systems.SoundEffectSystem)obj), ((com.badlogic.gdx.audio.Sound)value)); return;
      case 453: s453(((net.brokenspork.systems.SpriteRenderSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 455: s455(((net.brokenspork.systems.SpriteRenderSystem)obj), ((com.artemis.ComponentMapper)value)); return;
      case 457: s457(((net.brokenspork.systems.SpriteRenderSystem)obj), ((java.util.HashMap)value)); return;
      case 459: s459(((net.brokenspork.systems.SpriteRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.TextureAtlas)value)); return;
      case 461: s461(((net.brokenspork.systems.SpriteRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.SpriteBatch)value)); return;
      case 463: s463(((net.brokenspork.systems.SpriteRenderSystem)obj), ((com.badlogic.gdx.graphics.OrthographicCamera)value)); return;
      case 465: s465(((net.brokenspork.systems.SpriteRenderSystem)obj), ((com.badlogic.gdx.graphics.g2d.BitmapFont)value)); return;
      case 467: s467(((net.brokenspork.systems.SpriteRenderSystem)obj), ((com.artemis.utils.Bag)value)); return;
      case 469: s469(((net.brokenspork.systems.SpriteRenderSystem)obj), ((java.util.List)value)); return;
  }
     throw new IllegalArgumentException("Missing setter-stub " + field.setter + " for field " + field.name);
  }
  public Object invoke(Method m, Object obj, Object[] params) {
      switch(m.methodId) {
      case 16: return m16((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]), ((java.lang.Class)params[1]));
      case 17: return m17((com.artemis.ComponentManager)obj,((com.artemis.ComponentType)params[0]));
      case 18: return m18(((java.lang.Class)params[0]));
      case 19: return m19((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]));
      case 20: return m20((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]), ((com.artemis.ComponentType)params[1]), ((com.artemis.Component)params[2]));
      case 21: return m21((com.artemis.ComponentManager)obj,((com.artemis.ComponentType)params[0]), ((com.artemis.PackedComponent)params[1]));
      case 22: return m22((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]), ((com.artemis.ComponentType)params[1]), ((com.artemis.Component)params[2]));
      case 23: return m23((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]), ((com.artemis.ComponentType)params[1]));
      case 24: return m24((com.artemis.ComponentManager)obj,((com.artemis.ComponentType)params[0]));
      case 25: return m25((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]), ((com.artemis.ComponentType)params[1]));
      case 26: return m26((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]), ((com.artemis.utils.Bag)params[1]));
      case 27: return m27((com.artemis.ComponentManager)obj,((com.artemis.Entity)params[0]));
      case 28: return m28((com.artemis.ComponentManager)obj);
      case 29: return m29(((Number)params[0]).intValue());
      case 31: return m31((com.artemis.ComponentMapper)obj,((com.artemis.Entity)params[0]));
      case 32: return m32((com.artemis.ComponentMapper)obj,((com.artemis.Entity)params[0]), ((Boolean)params[1]).booleanValue());
      case 33: return m33((com.artemis.ComponentMapper)obj,((com.artemis.Entity)params[0]));
      case 34: return m34((com.artemis.ComponentMapper)obj,((com.artemis.Entity)params[0]), ((Boolean)params[1]).booleanValue());
      case 35: return m35((com.artemis.ComponentMapper)obj,((com.artemis.Entity)params[0]));
      case 36: return m36(((java.lang.Class)params[0]), ((com.artemis.World)params[1]));
      case 50: return m50((com.artemis.ComponentType)obj);
      case 51: return m51((com.artemis.ComponentType)obj);
      case 54: return m54((com.artemis.ComponentType)obj);
      case 55: return m55(((Number)params[0]).intValue());
      case 56: return m56((com.artemis.ComponentType)obj);
      case 57: return m57(((java.lang.Class)params[0]));
      case 58: return m58(((Number)params[0]).intValue());
      case 59: return m59(((java.lang.Class)params[0]));
      case 60: return m60(((java.lang.Class)params[0]));
      case 76: return m76((com.artemis.EntityManager)obj);
      case 77: return m77((com.artemis.EntityManager)obj);
      case 78: return m78((com.artemis.EntityManager)obj,((com.artemis.Entity)params[0]));
      case 79: return m79((com.artemis.EntityManager)obj,((com.artemis.Entity)params[0]));
      case 80: return m80((com.artemis.EntityManager)obj,((com.artemis.Entity)params[0]));
      case 81: return m81((com.artemis.EntityManager)obj,((com.artemis.Entity)params[0]));
      case 82: return m82((com.artemis.EntityManager)obj,((Number)params[0]).intValue());
      case 83: return m83((com.artemis.EntityManager)obj,((Number)params[0]).intValue());
      case 84: return m84((com.artemis.EntityManager)obj,((Number)params[0]).intValue());
      case 85: return m85((com.artemis.EntityManager)obj);
      case 89: return m89((com.artemis.EntityManager)obj);
      case 90: return m90(((Number)params[0]).intValue());
      case 92: return m92((com.artemis.PackedComponent)obj,((com.artemis.Entity)params[0]));
      case 93: return m93((com.artemis.PackedComponent)obj);
      case 95: return m95((com.artemis.PooledComponent)obj);
      case 104: return m104((com.artemis.managers.GroupManager)obj);
      case 105: return m105((com.artemis.managers.GroupManager)obj,((com.artemis.Entity)params[0]), ((java.lang.String)params[1]));
      case 106: return m106((com.artemis.managers.GroupManager)obj,((com.artemis.Entity)params[0]), ((java.lang.String)params[1]));
      case 107: return m107((com.artemis.managers.GroupManager)obj,((com.artemis.Entity)params[0]));
      case 108: return m108((com.artemis.managers.GroupManager)obj,((java.lang.String)params[0]));
      case 109: return m109((com.artemis.managers.GroupManager)obj,((com.artemis.Entity)params[0]));
      case 110: return m110((com.artemis.managers.GroupManager)obj,((com.artemis.Entity)params[0]));
      case 111: return m111((com.artemis.managers.GroupManager)obj,((com.artemis.Entity)params[0]), ((java.lang.String)params[1]));
      case 112: return m112((com.artemis.managers.GroupManager)obj,((com.artemis.Entity)params[0]));
      case 113: return m113();
      case 119: return m119((com.artemis.managers.PlayerManager)obj,((com.artemis.Entity)params[0]), ((java.lang.String)params[1]));
      case 120: return m120((com.artemis.managers.PlayerManager)obj,((java.lang.String)params[0]));
      case 121: return m121((com.artemis.managers.PlayerManager)obj,((com.artemis.Entity)params[0]));
      case 122: return m122((com.artemis.managers.PlayerManager)obj,((com.artemis.Entity)params[0]));
      case 123: return m123((com.artemis.managers.PlayerManager)obj);
      case 124: return m124((com.artemis.managers.PlayerManager)obj,((com.artemis.Entity)params[0]));
      case 125: return m125();
      case 131: return m131((com.artemis.managers.TagManager)obj,((java.lang.String)params[0]), ((com.artemis.Entity)params[1]));
      case 132: return m132((com.artemis.managers.TagManager)obj,((java.lang.String)params[0]));
      case 133: return m133((com.artemis.managers.TagManager)obj,((java.lang.String)params[0]));
      case 134: return m134((com.artemis.managers.TagManager)obj,((java.lang.String)params[0]));
      case 135: return m135((com.artemis.managers.TagManager)obj);
      case 136: return m136((com.artemis.managers.TagManager)obj,((com.artemis.Entity)params[0]));
      case 137: return m137((com.artemis.managers.TagManager)obj);
      case 138: return m138();
      case 144: return m144((com.artemis.managers.TeamManager)obj);
      case 145: return m145((com.artemis.managers.TeamManager)obj,((java.lang.String)params[0]));
      case 146: return m146((com.artemis.managers.TeamManager)obj,((java.lang.String)params[0]), ((java.lang.String)params[1]));
      case 147: return m147((com.artemis.managers.TeamManager)obj,((java.lang.String)params[0]));
      case 148: return m148((com.artemis.managers.TeamManager)obj,((java.lang.String)params[0]));
      case 149: return m149();
      case 156: return m156();
      case 192: return m192();
      case 194: return m194();
      case 198: return m198();
      case 204: return m204();
      case 206: return m206();
      case 208: return m208();
      case 214: return m214();
      case 226: return m226();
      case 230: return m230();
      case 238: return m238();
      case 239: return m239(((java.lang.String)params[0]));
      case 265: return m265();
      case 279: return m279((net.brokenspork.components.Sprite.Layer)obj);
      case 280: return m280();
      case 281: return m281(((java.lang.String)params[0]));
      case 293: return m293();
      case 305: return m305((net.brokenspork.systems.CollisionSystem)obj);
      case 306: return m306((net.brokenspork.systems.CollisionSystem)obj,((com.artemis.utils.ImmutableBag)params[0]));
      case 307: return m307((net.brokenspork.systems.CollisionSystem)obj);
      case 308: return m308();
      case 314: return m314((net.brokenspork.systems.ColorAnimationSystem)obj,((com.artemis.Entity)params[0]));
      case 315: return m315();
      case 323: return m323((net.brokenspork.systems.EntitySpawningTimerSystem)obj);
      case 324: return m324();
      case 328: return m328((net.brokenspork.systems.ExpiringSystem)obj,((com.artemis.Entity)params[0]), ((Number)params[1]).floatValue());
      case 329: return m329((net.brokenspork.systems.ExpiringSystem)obj,((com.artemis.Entity)params[0]));
      case 330: return m330((net.brokenspork.systems.ExpiringSystem)obj,((com.artemis.Entity)params[0]));
      case 331: return m331();
      case 343: return m343((net.brokenspork.systems.HealthRenderSystem)obj);
      case 344: return m344((net.brokenspork.systems.HealthRenderSystem)obj);
      case 345: return m345((net.brokenspork.systems.HealthRenderSystem)obj,((com.artemis.Entity)params[0]));
      case 346: return m346((net.brokenspork.systems.HealthRenderSystem)obj);
      case 347: return m347(((com.badlogic.gdx.graphics.OrthographicCamera)params[0]));
      case 363: return m363((net.brokenspork.systems.HudRenderSystem)obj);
      case 364: return m364((net.brokenspork.systems.HudRenderSystem)obj);
      case 365: return m365((net.brokenspork.systems.HudRenderSystem)obj);
      case 366: return m366((net.brokenspork.systems.HudRenderSystem)obj);
      case 367: return m367(((com.badlogic.gdx.graphics.OrthographicCamera)params[0]));
      case 373: return m373((net.brokenspork.systems.MovementSystem)obj,((com.artemis.Entity)params[0]));
      case 374: return m374();
      case 378: return m378((net.brokenspork.systems.ParallaxStarRepeatingSystem)obj,((com.artemis.Entity)params[0]));
      case 379: return m379();
      case 415: return m415((net.brokenspork.systems.PlayerInputSystem)obj);
      case 416: return m416((net.brokenspork.systems.PlayerInputSystem)obj,((com.artemis.Entity)params[0]));
      case 417: return m417((net.brokenspork.systems.PlayerInputSystem)obj,((Number)params[0]).intValue());
      case 418: return m418((net.brokenspork.systems.PlayerInputSystem)obj,((Number)params[0]).intValue());
      case 419: return m419((net.brokenspork.systems.PlayerInputSystem)obj,((Character)params[0]).charValue());
      case 420: return m420((net.brokenspork.systems.PlayerInputSystem)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue());
      case 421: return m421((net.brokenspork.systems.PlayerInputSystem)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue());
      case 422: return m422((net.brokenspork.systems.PlayerInputSystem)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue(), ((Number)params[2]).intValue());
      case 423: return m423((net.brokenspork.systems.PlayerInputSystem)obj,((Number)params[0]).intValue());
      case 424: return m424((net.brokenspork.systems.PlayerInputSystem)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue());
      case 425: return m425(((com.badlogic.gdx.graphics.OrthographicCamera)params[0]));
      case 431: return m431((net.brokenspork.systems.RemoveOffscreenShipsSystem)obj,((com.artemis.Entity)params[0]));
      case 432: return m432();
      case 438: return m438((net.brokenspork.systems.ScaleAnimationSystem)obj,((com.artemis.Entity)params[0]));
      case 439: return m439();
      case 449: return m449((net.brokenspork.systems.SoundEffectSystem)obj);
      case 450: return m450((net.brokenspork.systems.SoundEffectSystem)obj,((com.artemis.Entity)params[0]));
      case 451: return m451();
      case 471: return m471((net.brokenspork.systems.SpriteRenderSystem)obj);
      case 472: return m472((net.brokenspork.systems.SpriteRenderSystem)obj);
      case 473: return m473((net.brokenspork.systems.SpriteRenderSystem)obj);
      case 474: return m474((net.brokenspork.systems.SpriteRenderSystem)obj,((com.artemis.utils.ImmutableBag)params[0]));
      case 475: return m475((net.brokenspork.systems.SpriteRenderSystem)obj,((com.artemis.Entity)params[0]));
      case 476: return m476((net.brokenspork.systems.SpriteRenderSystem)obj);
      case 477: return m477((net.brokenspork.systems.SpriteRenderSystem)obj,((com.artemis.Entity)params[0]));
      case 478: return m478((net.brokenspork.systems.SpriteRenderSystem)obj,((com.artemis.Entity)params[0]));
      case 479: return m479(((com.badlogic.gdx.graphics.OrthographicCamera)params[0]), ((com.badlogic.gdx.graphics.g2d.SpriteBatch)params[1]));
  }
     throw new IllegalArgumentException("Missing method-stub " + m.methodId + " for method " + m.name);
  }
}

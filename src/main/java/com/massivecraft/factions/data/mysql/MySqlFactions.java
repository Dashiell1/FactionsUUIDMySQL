package com.massivecraft.factions.data.mysql;

import com.massivecraft.factions.Faction;
import com.massivecraft.factions.data.MemoryFactions;

public class MySqlFactions extends MemoryFactions {
  @Override
  public Faction generateFactionObject(String string) {
    return null;
  }

  @Override
  public Faction generateFactionObject() {
    return null;
  }

  @Override
  public void convertFrom(MemoryFactions old) {

  }

  @Override
  public void forceSave() {

  }

  @Override
  public void forceSave(boolean sync) {

  }
}

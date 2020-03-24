package com.massivecraft.factions.data.mysql;

import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.data.MemoryFPlayers;

public class MySqlFPlayers extends MemoryFPlayers {
  @Override
  protected FPlayer generateFPlayer(String id) {
    return null;
  }

  @Override
  public void convertFrom(MemoryFPlayers old) {

  }

  @Override
  public void forceSave() {

  }

  @Override
  public void forceSave(boolean sync) {

  }

  @Override
  public int load() {
    return 0;
  }
}

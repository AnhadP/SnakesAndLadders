// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game-service.proto

package com.snakesandladders.model;

public interface GameStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GameState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Player player = 1;</code>
   */
  java.util.List<com.snakesandladders.model.Player> 
      getPlayerList();
  /**
   * <code>repeated .Player player = 1;</code>
   */
  com.snakesandladders.model.Player getPlayer(int index);
  /**
   * <code>repeated .Player player = 1;</code>
   */
  int getPlayerCount();
  /**
   * <code>repeated .Player player = 1;</code>
   */
  java.util.List<? extends com.snakesandladders.model.PlayerOrBuilder> 
      getPlayerOrBuilderList();
  /**
   * <code>repeated .Player player = 1;</code>
   */
  com.snakesandladders.model.PlayerOrBuilder getPlayerOrBuilder(
      int index);
}

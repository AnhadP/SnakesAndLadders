package com.game.snakesandladders.server;

import com.snakesandladders.model.Die;
import com.snakesandladders.model.GameServiceGrpc;
import com.snakesandladders.model.GameState;
import com.snakesandladders.model.Player;
import io.grpc.stub.StreamObserver;

public class GameService extends GameServiceGrpc.GameServiceImplBase {

    @Override
    public StreamObserver<Die> turnService(StreamObserver<GameState> responseObserver) {
        Player client = Player.newBuilder().setName("Client").setPosition(0).build();
        Player server = Player.newBuilder().setName("Server").setPosition(0).build();

        return new DieStreamingRequest(client, server, responseObserver);
    }
}

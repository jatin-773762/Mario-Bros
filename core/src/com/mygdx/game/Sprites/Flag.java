package com.mygdx.game.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;

public class Flag extends InteractiveTileObject {
    public Flag(World world, TiledMap tiledMap, Rectangle bounds) {
        super(world, tiledMap, bounds);
    }
}
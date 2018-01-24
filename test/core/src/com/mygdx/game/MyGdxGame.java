package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class MyGdxGame extends ApplicationAdapter {

	private SpriteBatch batch;
	private TextureAtlas runatlas;
	private Animation a;
	private float time=0;

	@Override
	public void create () {
		batch=new SpriteBatch();
		runatlas=new TextureAtlas(Gdx.files.internal("run.atlas"));
		a=new Animation(1/3f,runatlas.getRegions());

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1,1,1,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		time +=Gdx.graphics.getDeltaTime();
		batch.draw(a.getKeyFrame(time,true),300,500);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		runatlas.dispose();


	}
}

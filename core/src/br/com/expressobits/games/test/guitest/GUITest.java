package br.com.expressobits.games.test.guitest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;



/**
 * Projeto para um fiel aprendizado de UI do libgdx, especificamente
 * o pacote scene2D.ui e suas subclasses.
 * @author Rafael
 * 
 * 
 *
 */
public class GUITest extends ApplicationAdapter {
	UIWidgetTest uIWidgetTest;
	
	private Stage stage;
	private Table table;
	
	private ShapeRenderer shapeRenderer;
	
	@Override
	public void create () {
		//
		uIWidgetTest.validate();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
}

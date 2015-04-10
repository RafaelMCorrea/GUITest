package br.com.expressobits.games.test.guitest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Container;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
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
	
	//Configurando o Stage
	private Stage stage;
	private Table table;
	private ShapeRenderer shapeRenderer;
	
	//Skin
	Skin skin;
	
	@Override
	public void create () {
		//uIWidgetTest.validate();
		
		//Configurando o Stage
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		table = new Table();
		
		//Skin
		skin = new Skin(Gdx.files.internal("uiskin.json"));
		
		Label label = new Label("Hello World Label", skin);
		table.add(label);
		
		table.setFillParent(true);//Preenche o tamanho baseado no seu pai(no caso stage)
		stage.addActor(table);//Adiciona o actor para um pai(no caso stage)
		shapeRenderer = new ShapeRenderer();//Renderizador utilizado para fazer o debug do draw table
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}
	
	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
		//Opcional: desenha tabela com debug
		table.drawDebug(shapeRenderer);
	}
	
	@Override
	public void dispose() {
		stage.dispose();
		shapeRenderer.dispose();
	}
}

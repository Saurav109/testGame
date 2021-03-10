package com.test.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.SpriteBatch


class MyGame : ApplicationAdapter() {
    lateinit var batch: Batch
    lateinit var img: Texture
    val TAG: String = "GAME_TAG"

    var x: String? = "thing"
    val d=D()
    override fun create() {
        super.create()
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")

        x = null


        log(TAG, d?.x)

    }


    override fun render() {
        super.render()



        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
//        batch.begin()
//        batch.draw(img, 0f, 0f)
//        batch.end()
    }

    override fun dispose() {
        super.dispose()
        batch.dispose()
        img.dispose()
    }


    fun log(tag: String, message: String?) {
        Gdx.app.log(tag, "message")
        Gdx.app.log(tag, message)
    }

    data class D(var x: String?=null, var y: String?=null)
}

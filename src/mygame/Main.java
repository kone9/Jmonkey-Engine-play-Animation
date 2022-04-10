package mygame;


import com.jme3.animation.AnimChannel;
import com.jme3.animation.AnimControl;
import com.jme3.animation.AnimEventListener;
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    //private AnimControl control_Anim_Mario;
    
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        
        /** Load a model mario rig Scene and add to Root Node */ 
        Spatial MarioRig_Root_scene = assetManager.loadModel("Models/Mario_rigging_compatible_con_godot_engine/Mario_rigging_compatible_con_godot_engine.j3o");
        rootNode.attachChild(MarioRig_Root_scene);
        
        //Tools of animations
        AnimChannel channel_anim_mario;
        AnimControl control_anim_mario;
        
        //get mario rig node and play animation
        Spatial MarioRig = ((Node)MarioRig_Root_scene).getChild("Mario_texturizado");
        control_anim_mario = MarioRig.getControl(AnimControl.class);
        System.out.println("rig mario control is: " + control_anim_mario);
        
        //Play Animation
        //control.addListener((AnimEventListener) this);//no work
        channel_anim_mario = control_anim_mario.createChannel();
        channel_anim_mario.setAnim("saltar_alto");
        
        

        //control_Anim_Mario.addListener(this);
        
        
        //control_Anim_Mario.addListener(this);
        //System.out.println(control_Anim_Mario);
        //playerControl = MarioRig.getControl(AnimControl.class); // get control over this model

        //animComposer.action("correr");
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}

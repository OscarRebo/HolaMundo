/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo3d6;

/**
 *
 * @author Osx
 */
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 *
 * @author Osx
 */
public class Cubo3D6 extends Application {
    
    @Override
    public void start(Stage primaryStage) {        
        Box cubo = crearCubo(); 
        Group root = new Group(); 
        root.getChildren().add(cubo);        
        PerspectiveCamera camara = new PerspectiveCamera();        
        Scene scene = new Scene(root, 850, 650); 
        scene.setCamera(camara);        
        primaryStage.setTitle("Cubo Girando");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    Box crearCubo(){
        Box cubo = new Box();
        cubo.setWidth(300); //tamaño x
        cubo.setHeight(300); // tamaño y
        cubo.setDepth(300);// tamaño z
        //LE TRASLADMAOS LA CENTRO
        cubo.setTranslateX(400);
        cubo.setTranslateY(300);
        //SI SE MODIFICA LA TRASLANCION EN Z SE LOGRA LA PERSPECTIVA
        cubo.setTranslateZ(1000);        
        PhongMaterial mat = new PhongMaterial();
        mat.setSpecularColor(Color.BLACK);
        mat.setDiffuseColor(Color.PINK);        
        cubo.setMaterial(mat);        
        Rotate GradosX = new Rotate(90, Rotate.X_AXIS);
        Rotate GradosY = new Rotate(45, Rotate.Y_AXIS);
        Rotate GradosZ = new Rotate(45, Rotate.Z_AXIS);
        cubo.getTransforms().addAll(GradosX, GradosY, GradosZ);        
       RotateTransition rt = new RotateTransition(Duration.millis(1000), cubo);      
      rt.setAxis(Rotate.X_AXIS);
       rt.setByAngle(360);
       rt.setCycleCount(10);
       rt.play();
       return cubo;
    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
}

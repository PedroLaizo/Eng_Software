package persist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Entity;

public abstract class Persist {
		
	public static void PersistSave(ArrayList<Entity> list ,String path){

		try {
			FileOutputStream file = new FileOutputStream(new File(path));
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			for(Entity object : list) {
				out.writeObject(object);
			}
			
			out.close();
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Entity> PersistLoad(String path) {
		
		ArrayList<Entity> list = new ArrayList<Entity>();
		
		boolean cont = true;
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(path));
			while(cont){
				Entity obj = null;
			try {
				obj = (Entity) input.readObject();
			}catch(ClassNotFoundException e) {
                e.printStackTrace();
            }if(obj != null)
                list.add(obj);
             else
                cont = false;
            	input.close();
			}
          }catch (FileNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
		return list;
	}
	
	
	
	
	
}
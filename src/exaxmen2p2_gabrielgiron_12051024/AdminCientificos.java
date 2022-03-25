/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaxmen2p2_gabrielgiron_12051024;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author Galex
 */
public class AdminCientificos {
    private ArrayList<Cientificos> listaCientificos = new ArrayList();
    private File archivo = null;
    
    public AdminCientificos(String path)
    {
        archivo = new File(path);
    }

    public ArrayList<Cientificos> getListaCientificos() {
        return listaCientificos;
    }

    public void setListaCientificos(ArrayList<Cientificos> listaCientificos) {
        this.listaCientificos = listaCientificos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargarArchivo()
    {
        try
        {
            listaCientificos = new ArrayList();
            Cientificos temp;
            if(archivo.exists())
            {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try
                {
                    while((temp = (Cientificos) objeto.readObject()) != null)
                    {
                        listaCientificos.add(temp);
                    }
                }
                catch(EOFException e)
                {
                    
                }
                objeto.close();
                entrada.close();
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo()
    {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Cientificos t : listaCientificos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}

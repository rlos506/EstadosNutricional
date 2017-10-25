/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;
/**
 *
 * @author Rouse
 */
public class TMPersona implements TableModel{
    private List<Persona> personas;
    
    public TMPersona(List<Persona> lista){
        personas = lista;
    }
    @Override
    public int getRowCount() {
        return(personas.size());
        }

    @Override
    public int getColumnCount() {
        return 6;
        }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = "";
        switch(columnIndex){
            case 0:{
                titulo = "Nombre";
                break;
            }
            case 1:{
                titulo= "Edad";
                break;
            }
            case 2:{
                titulo= "Cedula";
                break;
            }
            case 3:{
                titulo = "Genero";
                break;
            }
            case 4:{
                titulo = "Peso";
                break;
            }
            case 5:{
                titulo = "Altura";
                break;
            }
            
           
            
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
         }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
       }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = personas.get(rowIndex); 
       String valor = "";
       
        switch(columnIndex){
            case 0:{
                valor = p.getNombre();
                break;
            }
            case 1:{
                valor = String.valueOf(p.getEdad());
                break;
            }
            case 2:{
                valor= p.getCedula();
                break;
            }
            case 3:{
                valor = p.getGenero();
                break;
            }
            case 4:{
                valor = String.valueOf(p.getPeso());
                break;
            }
            case 5:{
                valor = String.valueOf(p.getAltura());
                break;
            }
            
            
        }
        return valor;
       }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Persona p = personas.get(rowIndex); 
        
        switch(columnIndex){
            case 0:{
                 p.setNombre(aValue.toString());
                break;
            } 
            case 1:{
                 p.setEdad((aValue).hashCode());
                break;
            }
            case 2:{
                 p.setCedula(aValue.toString());
                break;
            }
            case 3:{
                p.setGenero(aValue.toString());
                break;
            }
            case 4:{
                p.setPeso(aValue.hashCode());
                break;
            }
            case 5:{
                p.setAltura(aValue.hashCode());
                break;
            }
           
            
            
        }
        
          }

    @Override
    public void addTableModelListener(TableModelListener tl) {
           }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
           }
    
}

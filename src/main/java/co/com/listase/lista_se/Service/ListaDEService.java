package co.com.listase.lista_se.Service;

import co.com.listase.lista_se.Model.City;
import co.com.listase.lista_se.Model.Kid;
import co.com.listase.lista_se.Model.ListaDE;
import co.com.listase.lista_se.Model.ListaSE;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ListaDEService {
    private ListaDE kids;
    public ListaDEService() {
        //Simular que leyo un archivo o una base de datos
        kids = new ListaDE();
        kids.addKidToEnd(new Kid("1006", "Valeria Osorio", (byte) 20,"Female",new City("17001","Manizales")));
        kids.addKidToEnd(new Kid("1007", "Jhair Torres", (byte)18 ,"Male",new City("05001","Medellin")));
        kids.addKidToEnd(new Kid("1003", "John Jaime", (byte) 18,"Male",new City("05091","Betania")));
        kids.addKidToEnd(new Kid("1004", "Sergio Nuñez", (byte) 19,"Male",new City("11001","Bogota")));
        kids.addKidToEnd(new Kid("1008", "Sebastian Rugeles", (byte) 19,"Male",new City("17001","Manizales")));

    }
}
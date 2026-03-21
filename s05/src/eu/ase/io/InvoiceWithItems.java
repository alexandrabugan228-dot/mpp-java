package eu.ase.io;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InvoiceWithItems {
    private List<InvoiceItem> items;

    public InvoiceWithItems(List<InvoiceItem> items) {
        this.items = items;
    }

    public void saveToFile(String fileName) {

        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
            for(InvoiceItem item : items) {
                out.writeUTF(item.getDescription());
                out.writeDouble(item.getPrice());
                out.writeInt(item.getUnit());
            }

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<InvoiceItem> readFromFile(String fileName) {
        List<InvoiceItem> toReturn = new ArrayList<>();

        try {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));

            String desc;
            int units;
            double price;

            try {
                while (true) {
                    desc = in.readUTF();
                    price = in.readDouble();
                    units = in.readInt();
                    InvoiceItem item = new InvoiceItem(desc, units, price);
                    toReturn.add(item);
                }
            } catch (EOFException ex) {

            }
            in.close();
        } catch(IOException e) {

        }

        return toReturn;
    }

}
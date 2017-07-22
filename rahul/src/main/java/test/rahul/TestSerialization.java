package test.rahul;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Blob;

import org.hibernate.type.ByteArrayBlobType;

public class TestSerialization {
	public static void main(String args[]){
		Serialization ser = new Serialization();
		try {
			FileOutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(ser);
			out.flush();
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("ser.txt"));
			Serialization serIn = (Serialization)in.readObject();
			serIn.getValues();
			in.close();
			byte [] b = serialize(ser);
			Serialization deserialized = (Serialization) deserialize(b);
			System.out.println("After using Byte array");
			deserialized.getValues();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Object deserialize(byte[] b) {
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		Object obj = null;
		try {
			ObjectInputStream in = new ObjectInputStream(bais);
			obj = in.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	private static byte[] serialize(Serialization ser) throws IOException {
		ObjectOutputStream out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		out = new ObjectOutputStream(baos);
		out.writeObject(ser);
		byte [] b = baos.toByteArray();
		return b;
	}
	
}

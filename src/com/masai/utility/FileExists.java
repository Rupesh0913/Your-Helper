package com.masai.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;



public class FileExists {
	
		public static Map<Integer, Criminal> criminalFile(){
			Map<Integer, Criminal> cFile = null;

			File f = new File("Criminal.ser");
			boolean flag = false;
			try {
				if (!f.exists()) {
					f.createNewFile();
					flag = true;
				}

				if (flag) {

					cFile = new LinkedHashMap<>();
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
					oos.writeObject(cFile);
					return cFile;

				} else {

					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
					cFile = (Map<Integer, Criminal>) ois.readObject();

					return cFile;

				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			return cFile;
		}
		
		@SuppressWarnings("unchecked")
		public static Map<Integer, Crime> crimeFile(){
			Map<Integer, Crime> crFile = null;

			File f = new File("Crime.ser");
			boolean flag = false;
			try {
				if (!f.exists()) {
					f.createNewFile();
					flag = true;
				}

				if (flag) {

					crFile = new LinkedHashMap<>();
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
					oos.writeObject(crFile);
					return crFile;

				} else {

					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
					crFile = (Map<Integer, Crime>) ois.readObject();

					return crFile;

				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			return crFile;
		}
}

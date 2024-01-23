package Week5;
//Java Program illustrating use of io.RandomAccessFile class methods 
//read(), read(byte[] b), readBoolean(), readByte(), readInt() 
//readFully(byte[] b, int off, int len), readFully(), readFloat() 
//readChar(), readDouble(), 

import java.io.*; 
public class NewClass_Random 
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			double d = 1.5; 
			float f = 14.56f; 

			// Creating a new RandomAccessFile -  
			RandomAccessFile gee = new RandomAccessFile("C:\\Users\\madhavmadupu\\Desktop\\CollegeCode\\madhavmadupu_Java\\src\\Week5\\testdata.txt", "rw"); 

			// Writing to file 
			gee.writeUTF("Hello CSE 2A"); 

			// File Pointer at index position - 0 
			gee.seek(0); 

			// read() method : 
			System.out.println("Use of read() method : " + gee.read()); 

			gee.seek(0); 

			byte[] b = {1, 2, 3}; 
			
			// Use of .read(byte[] b) method : 
			System.out.println("Use of .read(byte[] b) : " + gee.read(b)); 

			// readBoolean() method : 
			System.out.println("Use of readBoolean() : " + gee.readBoolean()); 

			// readByte() method : 
			System.out.println("Use of readByte() : " + gee.readByte()); 

			gee.writeChar('c'); 
			gee.seek(0); 

			// readChar() : 
			System.out.println("Use of readChar() : " + gee.readChar()); 

			gee.seek(0); 
			gee.writeDouble(d); 
			gee.seek(0); 

			// read double 
			System.out.println("Use of readDouble() : " + gee.readDouble()); 

			gee.seek(0); 
			gee.writeFloat(f); 
			gee.seek(0); 

			// readFloat() : 
			System.out.println("Use of readFloat() : " + gee.readFloat()); 

			gee.seek(0); 
			// Create array upto geek.length 
			byte[] arr = new byte[(int) gee.length()]; 
			// readFully() : 
			gee.readFully(arr); 
			
			String str1 = new String(arr); 
			System.out.println("Use of readFully() : " + str1); 

			gee.seek(0); 
			
			// readFully(byte[] b, int off, int len) : 
			gee.readFully(arr, 0, 8); 
			
			String str2 = new String(arr); 
			System.out.println("Use of readFully(byte[] b, int off, int len) : " + str2); 
		} 
		catch (IOException ex) 
		{ 
			System.out.println("Something went Wrong"); 
			ex.printStackTrace(); 
		} 
	} 
}
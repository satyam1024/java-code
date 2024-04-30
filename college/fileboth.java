import java.io.*;
class B
{
public static void main(String args[])throws IOException
{
FileInputStream fis=new FileInputStream("tt.txt");
FileOutputStream fos=new FileOutputStream("t1.txt");

int t=0;
while((t=fis.read())!=-1)
{
fos.write((char)t);
}

fis.close();
fos.close();
}
} 
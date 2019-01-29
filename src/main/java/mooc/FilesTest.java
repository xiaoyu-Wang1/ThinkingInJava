package mooc;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class FilesTest {
	
	public static void main(String[] a)
	{
		moveFile();
		fileAttributes();
		createDirectory();
	}

	public static void moveFile() {
		Path from = Paths.get("c:/temp", "abc.txt");
		//�ƶ�c:/temp/abc.txt��c:/temp/test/def.txt����Ŀ���ļ��Ѵ��ڣ����滻
		Path to = from.getParent().resolve("test/def.txt");
		try {
			//�ļ��Ĵ�Сbytes
			System.out.println(Files.size(from));
			//�����ļ��ƶ�����  ���Ŀ���ļ��Ѿ����ڣ����滻
			Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.err.println("�ƶ��ļ�����" + e.getMessage());
		}
	}
	
	
	public static void fileAttributes(){
		Path path = Paths.get("c:/temp");
		//1
		System.out.println(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
		//2
		try {
			//����ļ��Ļ�������
			BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println(attributes.isDirectory());
			System.out.println(new Date(attributes.lastModifiedTime().toMillis()).toLocaleString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createDirectory(){
		Path path = Paths.get("c:/temp/test");
		try {
			//�����ļ���
			if(Files.notExists(path)){
				Files.createDirectories(path);
				System.out.println("create dir");
			}else{
				System.out.println("dir exists");
			}
			Path path2 = path.resolve("A.java"); 
			Path path3 = path.resolve("B.java");
			Path path4 = path.resolve("C.txt");
			Path path5 = path.resolve("D.jpg");
			Files.createFile(path2);
			Files.createFile(path3);
			Files.createFile(path4);
			Files.createFile(path5);
			
			//������������
			DirectoryStream<Path> paths = Files.newDirectoryStream(path);
			for(Path p : paths){
				System.out.println(p.getFileName());
			}
			System.out.println();
			
			//����һ�����й�����,�����ļ�����java txt��β���ļ�
			DirectoryStream<Path> pathsFilter = Files.newDirectoryStream(path, "*.{java,txt}");
			for(Path p : pathsFilter){
				System.out.println(p.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

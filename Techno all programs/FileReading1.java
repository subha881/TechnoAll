public class FileReading1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("\"C:\\Users\\mohan\\OneDrive\\Desktop\\Ankita 1\"");

		Scanner reader=new Scanner(file);

			while (reader.hasNextLine()) {

				System.out.println(reader.nextLine());
			}

	
		
		System.out.println("Program continue.....");

	}

}
public class FindingDuplicates {

  public static void main(String args[]) {
    int intArray[] = { 1, 2, 3, 1, 2 };

    findDuplicates(intArray);
  }

  public static void findDuplicates(int[] id) {
    System.out.println("Duplicate student id: ");
    for (int i = 0; i < id.length; i++) {
      for (int j = i + 1; j < id.length; j++) {
        if (id[i] == id[j]) {
          System.out.println("id: " + id[i]);
          // System.out.println("i: " + i);
          // System.out.println("j: " + j);
          break;
        }
      }
    }

  }

}
/*
class ArrItem
{
    public int item;
    public int index;

    public ArrItem(int item,int index)
    {
        this.item=item;
        this.index=index;
    }
}
*/

class Sorting {
    public ArrayList<ArrItem> sortedWithIndices(int arr[]) {
        // Your code here
       ArrayList<ArrItem> list = new ArrayList<>();

               for (int i = 0; i < arr.length; i++) {
                   list.add(new ArrItem(arr[i], i));
               }

               // Sort by 'item' ascending, then by 'index' ascending
               Collections.sort(list, (a, b) -> {
                   if (a.item != b.item) {
                       return Integer.compare(a.item, b.item);
                   }
                   return Integer.compare(a.index, b.index);
               });

               return list;
        }
        // Create an array of ArrItem objects and sort by item field
    }
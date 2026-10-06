package problem2;

public class IntegerList
{
    private int currentNumberOfInts;
    private int currentListSize;
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        this.currentNumberOfInts = list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<this.currentNumberOfInts; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    // my work:

    // 1)
    public void increaseSize(){
        // now let's increase the size;
        // first we copy:
        int[] helper = new int[list.length*2];
        for (int i = 0 ; i < list.length ; i++){
            helper[i] = list[i];
        }
        // then we reference:
        list = helper;
    }

    // 2)
    public void addElement(int newVal){
        if (this.currentNumberOfInts == list.length){
            this.increaseSize();
        }

        list[this.currentNumberOfInts++] = newVal;


    }

    // 3)
    public void removeFirst(int newVal){
        int flag = -1;
        for (int i = 0 ; i<this.currentNumberOfInts; i++){
            if (list[i] == newVal){
                flag = i;
                break;
            }
        }
        if (flag >= 0){
            for (int i = flag; i<this.currentNumberOfInts-1;i++){
                list[i] = list[i+1];
            }
            this.currentNumberOfInts--;
        }
    }

    // 4)
    public void removeAll(int newVal){
        int occurs = 0;
        for (int e : list){
            if (e==newVal){
                occurs++;
            }
        }

        while (occurs > 0){
            removeFirst(newVal);
            occurs--;
        }
    }




}

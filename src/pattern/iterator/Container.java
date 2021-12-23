package pattern.iterator;

/**
 * @author wangyu
 * @date 2021/12/23 15:07
 */
public class Container {

    public String[] names;

    public Container(String[] names) {
        this.names = names;
    }

    public Iterator getIterator(){
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index< names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}

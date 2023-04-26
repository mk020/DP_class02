package hw.ch11;

public abstract class Entry {
    
    public abstract int getCount();

    public abstract String getName();

    public abstract String getDate();

    public abstract int getSize();

    public abstract String getAuthor();

    // 목록을 표시한다
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다 // 오버로딩
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ") [" + getDate() + "] [" +
            getCount() + "개] [" + getAuthor() + "]";
    }
}

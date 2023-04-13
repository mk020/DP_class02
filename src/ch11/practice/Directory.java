package ch11.practice;

import java.util.ArrayList;
import java.util.List;

// composite(그릇)에 해당되는 클래스
public class Directory extends Entry {
    private String name;

    // 자기 내용물들을 관리하는 리스트
    private List<Entry> directory = new ArrayList<>(); // Entry는 부모 타입(파일, 디렉토리 둘 다 O)

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // 자기 내용물들의 size를 다 합치는 일을 함
    @Override
    public int getSize() {
        int size = 0;

        // 확장된 for문
        for (Entry entry: directory) {
            size += entry.getSize(); // 재귀적 호출
        }
        return size;
    }

    // 자기 내용물들의 printlist를 호출함
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this); // 자기것 출력

        for (Entry entry: directory) { // 자식들 출력
            entry.printList(prefix + "/" + name);
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}

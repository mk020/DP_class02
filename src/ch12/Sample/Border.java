package ch12.Sample;

// 장식자를 나타냄
public abstract class Border extends Display {
    // 장식 대상
    protected Display display;             // 이 장식틀이 감싸는 '내용물'

    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}

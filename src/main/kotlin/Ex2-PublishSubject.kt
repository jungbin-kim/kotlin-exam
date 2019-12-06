import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

fun main(args: Array<String>) {
    val subject: Subject<Int> = PublishSubject.create() // 이벤트를 전달해줄 subject 생성

    subject
        .map { it % 2 == 0 } // 이벤트로 넘겨받은 인자가 Even 이면 true, 아니면 false
        .subscribe { println("The number is ${(if (it) "Even" else "Odd")}") }

    subject.onNext(4) // 데이터와 함께 이벤트 발행
    subject.onNext(9)

}


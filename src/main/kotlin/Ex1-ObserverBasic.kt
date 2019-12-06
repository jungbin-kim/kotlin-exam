import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

fun main(args: Array<String>) {
    var list: List<Any> = listOf("One", 1, 2, "Three")
//    // 리스트의 데이터를 pull 해서 가져오는 동작 방식
////    var iterator = list.iterator()
////    while(iterator.hasNext()) {
////        println(iterator.next())
////    }
//
    var observable: Observable<Any> = list.toObservable()

    // Observable 구독
    observable.subscribeBy(
        onNext = { println(it) }, // 변경사항이 onNext로 Push
        onError = { it.printStackTrace() },
        onComplete = { println("DONE!") }
    )
}


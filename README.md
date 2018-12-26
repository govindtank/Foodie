# Foodie
Demo application to show food outlets around user.


## Architecture

This app focuses on scalable, flexible and reactive app architecure. It can even be "too much code" (e.g. dependency injection) for an app this size, but it is meant to be scaled well.

It is a version of MVVM with interactors as an additional layer to enhance re-usability. The app uses following frameworks


* [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) (throughout the data layer; for thread switching)
* [Livedata](https://developer.android.com/topic/libraries/architecture/livedata) (between ViewModels and Fragments)
* [RxJava2](https://github.com/ReactiveX/RxJava) (enabling reactiveness on data layer)
* [Room](https://developer.android.com/topic/libraries/architecture/room)
* [Paging Library](https://developer.android.com/topic/libraries/architecture/paging/) (for pagination and integration with room)
* [Epoxy](https://github.com/airbnb/epoxy) - Epoxy is a very flexible framework developed by Airbnb. We use it with recyclerView for any kind of data that can be presented in a list format (e.g. venue detail fragment)
* [Kodein](https://kodein.org) (KOtlin DEpendency INjection)
* Retrofit2
* [Klint](https://github.com/shyiko/ktlint) (code formatter for Kotlin)


### Improvements
* Styling and theming are not as good as they should be. Also working on a scene using motion layout but could not complete it.
* Not enough tests. Lack of time.

Please help yourself with the app and the code. I would appreciate a thorough read of the code and would love to discuss the goods and bads of the architecture.

<img src="https://user-images.githubusercontent.com/6247940/50457454-a67aaf00-0981-11e9-91b3-4723b9d86f42.png" width="200">

<img src="https://user-images.githubusercontent.com/6247940/50457472-c1e5ba00-0981-11e9-9831-d19e5a31e319.png" width="200">


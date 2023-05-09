# compose-wallet-button

[![Maven Central](https://img.shields.io/maven-central/v/com.google.wallet.button/compose-wallet-button)](https://search.maven.org/search?q=g:com.google.wallet.button)

An Android library that provides a [Jetpack Compose](https://developer.android.com/jetpack/compose) wrapper on top of the
[Google Wallet button assets](https://developers.google.com/wallet/generic/resources/brand-guidelines).

## Installation

The library is hosted on Maven central and can be used by ensuring the following lines exist in each gradle file:

**build.gradle:**

```groovy
repositories {
    mavenCentral()
}
```

**app/build.gradle:**

```
dependencies {
    implementation "com.google.wallet.button:compose-wallet-button:<version>"
}
```

## Usage

```kotlin
// other imports omitted for brevity
// see full example in the "app" directory

import com.google.wallet.button.ButtonType
import com.google.wallet.button.WalletButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val onClick = { println("Button clicked") }

        setContent {
            // Default
            WalletButton(onClick = onClick)

            // Customized look
            WalletButton(onClick = onClick, modifier = Modifier.width(350.dp))

            // Condensed version
            WalletButton(onClick = onClick, type = ButtonType.AddCondensed)
        }
    }
}
```
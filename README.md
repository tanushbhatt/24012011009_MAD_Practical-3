# Practical-3: Implicit & Explicit Intent

## AIM

Create an Android application which demonstrates **Implicit Intent** and
**Explicit Intent**.

The application provides buttons to perform the following operations:

1.  Make a call to a specific number
2.  Open a specific URL
3.  Open Call Log
4.  Open Gallery
5.  Set Alarm
6.  Open Camera
7.  Open Login Activity

------------------------------------------------------------------------

## Study / Concepts

This practical covers:

-   Intent
-   Types of Intent
-   Types of Intent Action
-   `Intent.setData()` method
-   `Intent.setType()` method
-   Button
-   ConstraintLayout
-   CoordinatorLayout
-   `startActivity()` method
-   `ActivityResultContracts`
-   Permission in Android Manifest
-   `ContextCompat.checkSelfPermission()`
-   `ActivityCompat.requestPermissions()`
-   `Uri.parse()`
-   `ContactsContract.Contacts.CONTENT_TYPE`
-   `CallLog.Calls.CONTENT_TYPE`
-   `"image/*"`
-   `"tel:"`
-   Adding Drawable Resources
-   Adding Activity in an Android project

------------------------------------------------------------------------

## Types of Intent

### 1. Implicit Intent

An **Implicit Intent** does not specify a particular Activity or
application.

It tells Android what action needs to be performed, and Android finds a
suitable application to handle it.

Examples in this practical:

-   Opening a website
-   Opening the Call Log
-   Opening the Gallery
-   Opening the Camera
-   Setting an Alarm
-   Making a phone call

Example:

``` kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)
```

### 2. Explicit Intent

An **Explicit Intent** specifies the Activity that should be opened.

In this practical, the Login Activity is opened using an Explicit
Intent.

Example:

``` kotlin
val intent = Intent(this, LoginActivity::class.java)
startActivity(intent)
```

------------------------------------------------------------------------

## Intent Actions Used

### Open Website

The browser is opened using `ACTION_VIEW`.

``` kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)
```

### Make Phone Call

The phone number is passed using the `tel:` URI.

``` kotlin
val intent = Intent(Intent.ACTION_DIAL)
intent.data = Uri.parse("tel:9999999999")
startActivity(intent)
```

### Open Call Log

The Call Log content type can be used with an appropriate Intent.

``` kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.type = CallLog.Calls.CONTENT_TYPE
startActivity(intent)
```

### Open Gallery

The Gallery can be opened using the image MIME type:

``` kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.type = "image/*"
startActivity(intent)
```

### Open Camera

The Camera can be launched using:

``` kotlin
val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
startActivity(intent)
```

### Set Alarm

An alarm can be created using the Alarm Clock Intent action.

``` kotlin
val intent = Intent(AlarmClock.ACTION_SET_ALARM)
startActivity(intent)
```

### Open Login Activity

Login Activity is opened using an Explicit Intent:

``` kotlin
val intent = Intent(this, LoginActivity::class.java)
startActivity(intent)
```

------------------------------------------------------------------------

## Important Methods and Classes

### `Intent.setData()`

`setData()` is used to provide data to an Intent.

Example:

``` kotlin
intent.data = Uri.parse("https://www.google.com")
```

### `Intent.setType()`

`setType()` specifies the type of data that the Intent should handle.

Example:

``` kotlin
intent.type = "image/*"
```

### `Uri.parse()`

`Uri.parse()` converts a String into a URI.

Example:

``` kotlin
Uri.parse("tel:9999999999")
```

### `startActivity()`

`startActivity()` starts another Activity or opens an application that
can handle the Intent.

Example:

``` kotlin
startActivity(intent)
```

------------------------------------------------------------------------

## Permissions

Some operations may require permissions.

Permissions are declared in the `AndroidManifest.xml` file.

The practical also covers:

``` kotlin
ContextCompat.checkSelfPermission()
```

and:

``` kotlin
ActivityCompat.requestPermissions()
```

These are used to check and request required permissions at runtime.

------------------------------------------------------------------------

## Activity Result Contracts

The practical also includes the concept of `ActivityResultContracts`.

They provide a structured way to receive a result from another Activity
or system component.

Example:

``` kotlin
registerForActivityResult(
    ActivityResultContracts.StartActivityForResult()
) { result ->
    // Handle result
}
```

------------------------------------------------------------------------

## UI

The application contains buttons for each Intent operation:

``` text
Web Url:     [ Browse ]

Phone No.:   [ Call ]

Call Log:    [ Call Log ]

Gallery:     [ Gallery ]

Camera:      [ Camera ]

Alarm:       [ Alarm ]

Login:       [ Login ]
```

The UI is created using `ConstraintLayout` and buttons.

------------------------------------------------------------------------

## Output

The application demonstrates:

-   Opening a website
-   Dialing a phone number
-   Opening the Call Log
-   Opening the Gallery
-   Setting an alarm
-   Opening the Camera
-   Opening the Login Activity

![Practical-3 Output](screenshots/practical3_output.png)

------------------------------------------------------------------------

## Result

The Android application successfully demonstrates **Implicit Intent and
Explicit Intent** by performing different operations such as opening
websites, making calls, accessing the Call Log and Gallery, opening the
Camera, setting an alarm, and navigating to the Login Activity.

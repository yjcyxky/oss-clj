# oss-clj
Thin Clojure wrapper arround minio-java client library

oss docs: https://help.aliyun.com/document_detail/32008.html
oss-java docs : https://gosspublic.alicdn.com/AliyunJavaSDK/3.10.2/javadoc/index.html

## Usage

```
(def conn (connect "http://oss-cn-shanghai.aliyuncs.com" "LTAI4Fi5MEgTKfdfdxxxx43a" "hQhPB8tRFlog5EdfdfdxxxOLdwFVLgt"))

(make-bucket conn "my.bucket" )  ;; creates a bucket, returns bucket name

(put-object conn "my.bucket" "photo.jpg") ; uploads a file, returns map of {:keys [bucket name]}

(def photo (get-objet conn "my.bucket" "photo.jpg")) ; returns Clojure  IBufferedReader.

;; so you can use it with spit/copy and other Clojure functions that take readers.

(spit "myDownloadedPhoto.jpg" photo)

```

## License

Copyright © 2020 Jingcheng Yang

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

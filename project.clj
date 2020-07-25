(defproject oss-clj "0.1.0"
  :description "Clojure Wrapper around oss-java client"
  :url "https://github.com/clinico-omics/oss-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.aliyun.oss/aliyun-sdk-oss "3.10.2"]
                 [clojure.java-time "0.3.2"]
                 [clj-time "0.15.2"]
                 [org.clojure/data.json "1.0.0"]]
  :repl-options {:init-ns oss-clj.core}

  :repositories [["central" "https://maven.aliyun.com/repository/central"]
                 ["jcenter" "https://maven.aliyun.com/repository/jcenter"]
                 ["clojars" "https://mirrors.tuna.tsinghua.edu.cn/clojars/"]]

  :plugin-repositories [["central" "https://maven.aliyun.com/repository/central"]
                        ["jcenter" "https://maven.aliyun.com/repository/jcenter"]
                        ["clojars" "https://mirrors.tuna.tsinghua.edu.cn/clojars/"]]

  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :gpg
                                    :password :gpg}]])

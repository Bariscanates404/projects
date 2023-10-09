(ns corefunctions.apply)


(apply str ["str1" "str2" "str3"])                          ;;=> "str1str2str3"

;;practical example

(def entries [{:month 1 :val 12}
              {:month 2 :val 3}
              {:month 3 :val 32}
              {:month 4 :val 18}
              {:month 5 :val 32}
              {:month 6 :val 62}
              {:month 7 :val 12}
              {:month 8 :val 142}
              {:month 9 :val 52}
              {:month 10 :val 18}
              {:month 11 :val 23}
              {:month 12 :val 56}])

(apply max (map
             #(:val %)
             entries))
;;return 142
;;this translates into (max 12 3 32 18 32 62 12 142 52 18 23 56)
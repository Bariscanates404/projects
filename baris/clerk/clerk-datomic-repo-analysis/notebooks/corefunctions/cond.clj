(ns corefunctions.cond)


(defn pos-neg-or-zero
  "Determines whether or not n is positive, negative, or zero"
  [n]
  (cond

    (> n 25) "+25'"
    (> n 20) "+20"
    :else "zero"))

(pos-neg-or-zero 30)


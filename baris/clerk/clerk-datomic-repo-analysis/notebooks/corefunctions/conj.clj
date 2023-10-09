(ns corefunctions.conj)

(conj {1 2, 3 4} [5 6])
;;=> {5 6, 1 2, 3 4}
(conj {1 2, 3 4} [5 6] [7 8])
(conj {1 2, 3 4} [[5 6][7 8] [9 10]])
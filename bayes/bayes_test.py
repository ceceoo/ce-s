import unittest
from bayes import bayes


class MyTestCase(unittest.TestCase):
    def test_bayes_stable_p2(self):
        self.assertEqual(bayes(0.01, 0.5), 0.01)

    def test_bayes_flexible_p2(self):
        p2 = 0.5
        while p2 < 1:
            print(bayes(0.01, p2))
            p2 = p2 + 0.01
        self.assertEqual(bayes(0.01, p2), 1)


if __name__ == '__main__':
    unittest.main()

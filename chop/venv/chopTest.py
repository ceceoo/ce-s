import unittest
from chop import chop_list


class MyTestCase(unittest.TestCase):
    def test_empty_list(self):
        empty_list = []
        self.assertEqual(chop_list(empty_list, 1), -1)

    def test_single_value_list(self):
        single_value = [3]
        self.assertEqual(chop_list(single_value, 3), 0)

    def test_multi_value_list(self):
        multi_value = [1,34,56,88,100]
        self.assertEqual(chop_list(multi_value, 34), 1)


if __name__ == '__main__':
    unittest.main()

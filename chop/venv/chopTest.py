import unittest
from chop import chop_list


class MyTestCase(unittest.TestCase):
    def test_empty_list(self):
        empty_list = []
        self.assertEqual(chop_list(empty_list, 1), -1)

    def test_single_value_list(self):
        single_value = [3]
        self.assertEqual(chop_list(single_value, 3), 0)
if __name__ == '__main__':
    unittest.main()

import unittest
from chop import chop_list


class MyTestCase(unittest.TestCase):
    def test_empty_list(self):
        empty_list = []
        self.assertEqual(chop_list(empty_list, 1), -1)


if __name__ == '__main__':
    unittest.main()

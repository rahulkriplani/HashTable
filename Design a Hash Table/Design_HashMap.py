class MyHashMap(object):

    def __init__(self):
        self.l = [-1]*1000001
        

    def put(self, key, value):
        """
        :type key: int
        :type value: int
        :rtype: None
        """
        self.l[key] = value
        

    def get(self, key):
        """
        :type key: int
        :rtype: int
        """
        return self.l[key]
        

    def remove(self, key):
        """
        :type key: int
        :rtype: None
        """
        self.l[key] = -1

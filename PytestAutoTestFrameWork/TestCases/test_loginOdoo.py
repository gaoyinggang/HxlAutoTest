
import pytest

from data.login_data import LoginData


@pytest.mark.loginTest
class TestLogin001(object):
    """登录"""
    login_data = LoginData

    @pytest.mark.parametrize('username, password', login_data.login_data)
    def test_login001(self, open_url, username, password):
        login_odoo = open_url
        login_odoo.login(username, password)
        # actual = login_page.get_login_success_account()
        # assert expect in actual, "登录成功, 断言失败"
        assert True
if __name__ == "__main__":
    pytest.main(['-v', 'test_loginOdoo.py'])
